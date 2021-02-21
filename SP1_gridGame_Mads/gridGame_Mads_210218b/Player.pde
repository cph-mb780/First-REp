class Player
{
  int x;
  int y;
  int colorState = 3;
  int health;
  int score;

  Player(int x, int y)
  {
    this.x = x;
    this.y = y;
    health = 100;
    score = 0;
  }

  void takeDamage()
  {
    health--;
    if (health < 0)
    {
      health = 0;
    }
  }

  void heal()
  {
    if (health < 100)
    {
      health += 1;
    } else if (health >= 100)
    {
      health = 100;
    }
  }
  void increaseScore()
  {
    score+=10;
  }
  void controlPlayer()
  {
    if (keyPressed) {
      if (key == 'w' && this.y > 0) {
        player.y--;
      } else if (key == 's' && this.y < 24) {
        player.y++;
      } else if (key == 'a' && this.x > 0) {
        player.x--;
      } else if (key == 'd' && this.x < 24) {
        player.x++;
      }
    }
  }
  
}    
