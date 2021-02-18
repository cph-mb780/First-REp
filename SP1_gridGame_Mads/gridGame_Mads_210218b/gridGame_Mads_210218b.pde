import processing.sound.*;
SoundFile gameOver;

int gridSize = 40;
int [][] grid = new int[25][25];
int startX;
int startY;
//Random float to determine food location
float ranFood= random(1);



Player player;
Enemy [] enemy = new Enemy[4];
Food [] food = new Food[4];


void setup()
{
  size(1001, 1001);
  gameOver = new SoundFile(this, "gameover.mp3");
  player = new Player(startPosX(), startPosY());

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
    c = color (255, 0, 0);
    break;
  }
  return c;
}

void updateGrid()
{

  grid[player.x][player.y] = player.colorState;

  for (int i = 0; i < 4; i++)
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
    for (int i = 0; i < 4; i++)
    {
      food[i].moveAwayFromPlayer();
    }
  }
}



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

void resolveCollisions()
{
  for ( int i = 0; i < 4; i++)
  {
    if (player.x == food[i].x && player.y == food[i].y)
    {
      player.heal();
      player.increaseScore();
      food[i] = new Food(startPosX(), startPosY(), player);
    }
  }

  for (int i = 0; i < enemy.length; i++)
  {
    if (player.x == enemy[i].x && player.y == enemy[i].y)
    {
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
void keyPressed()
{
  if (key == 'w' && player.y != 0)
  {
    player.y--;
  }
  if (key == 's' && player.y < 24)
  {
    player.y++;
  }
  if (key == 'a' && player.x != 0)
  {
    player.x--;
  }
  if (key == 'd' && player.x < 24)
  {
    player.x++;
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
