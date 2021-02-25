import processing.sound.*;
SoundFile gameOver;
SoundFile doh;
SoundFile woho;

// Set number of enemies:
int numEnemies = 4;

//Set amount of food
int numFood = 4;






int gridSize = 40;
int [][] grid = new int[25][25];
int startX;
int startY;




Player player;
Enemy [] enemy = new Enemy[numEnemies];
Food [] food = new Food[numFood];


void setup()
{
  size(1001, 1001);
  
//setup game sounds
  gameOver = new SoundFile(this, "gameover.mp3");
  gameOver.rate(1.0);
  doh = new SoundFile(this, "doh.mp3");
  doh.rate(0.7);
  woho = new SoundFile(this, "woho.mp3");
  woho.rate(1.0);
  
  //Player start position
  player = new Player(startPosX(), startPosY());
  
  
//Enemy and Food start position
  for (int i = 0; i < enemy.length; i++)
  {
    enemy[i] = new Enemy(startPosX(), startPosY(), player);
  }

  for (int i = 0; i < food.length; i++)
  {
    food[i] = new Food(startPosX(), startPosY(), player);
  }
}


void draw()
{

  clearBoard();
  updateGrid();
  drawBoard();
  player.controlPlayer();
  resolveCollisions();
  showScore();
  showHealth();
  isGameOver();
  displayGameOver();
}

void drawBoard()
{
  for (int x = 0; x < grid.length; x++)
  {
    for (int y = 0; y < grid[0].length; y++)
    {
      fill(setGridColor(grid[x][y]));
      rect(x * gridSize, y * gridSize, gridSize, gridSize);
    }
  }
}

void clearBoard()
{
  for (int x = 0; x < grid.length; x++)
  {
    for (int y = 0; y < grid[0].length; y++)
    {
      grid[x][y] = 0;
    }
  }
}

//switch statement to set color for specific gridpositions
color setGridColor(int colorState)
{
  color c = color(255);
  switch(colorState)
  {
  case 0:
    c = color(3, 49, 46);
    break;

  case 1:
    c = color (3, 113, 113);

  case 2:
    c = color (0, 185, 174);
    break;

  case 3:
    c = color (255);
    break;

  case 4:
    c = color (random(100,255), random(50), random(50));
    break;
  }
  return c;
}

//Updates enemies and food positions
void updateGrid()
{

  grid[player.x][player.y] = player.colorState;

  for (int i = 0; i < food.length; i++)
  {
    grid[food[i].x][food[i].y] = food[i].colorState;
  }
  for (int i = 0; i < enemy.length; i++)
  {
    grid[enemy[i].x][enemy[i].y] = enemy[i].colorState;
  }

  if (frameCount%20 == 0)
  {
    for (int i = 0; i < enemy.length; i++)
    {
      enemy[i].moveTowardsPlayer();
    }
  }

  if (frameCount%20 == 0)
  {
    for (int i = 0; i < food.length; i++)
    {
      food[i].moveAwayFromPlayer();
    }
  }
}


//Random start position
int startPosX()
{
  startX = (int)random(grid.length);

  return startX;
}

int startPosY()
{
  startY = (int)random(grid[0].length);

  return startY;
}

//Checks if player collides with food or enemies
void resolveCollisions()
{
  for ( int i = 0; i < food.length; i++)
  {
    if (player.x == food[i].x && player.y == food[i].y)
    {
      woho.play();
      player.heal();
      player.increaseScore();
      food[i] = new Food(startPosX(), startPosY(), player);
    }
  }

  for (int i = 0; i < enemy.length; i++)
  {
    if (player.x == enemy[i].x && player.y == enemy[i].y)
    {
      //The sound plays to the end without interruption
      if (!doh.isPlaying())
      {
        //doh.rate(0.7);
        doh.play();
      }
      player.takeDamage();
    }
  }
}


boolean isGameOver()
{
  if (player.health <= 0)
  {
    return true;
  } else
  {
    return false;
  }
}

void showScore()
{
  textSize(32);
  fill(255);
  text("Score: " + player.score, (width/5) * 4, 40);
}

void showHealth()
{
  textSize(32);
  fill(255);
  text("Health: " + player.health, (width/5) * 4, 100);
}

void displayGameOver()
{
  if (isGameOver())
  {

    textSize(50);
    textAlign(CENTER);
    fill(255, 0, 0);
    text("Game Over Man!... Game Over!\n Score: " + player.score, width/2, height/2);
    gameOver.play();
    noLoop();
  }
}
