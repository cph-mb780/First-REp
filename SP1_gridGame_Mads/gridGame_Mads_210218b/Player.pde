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
    health += 10;
    } else if (health >= 100)
    {
      health = 100;
    }
   }
void increaseScore()
{
  score+=10;
}
}    
