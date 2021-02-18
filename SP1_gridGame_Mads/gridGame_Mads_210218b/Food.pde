class Food
{
  int x;
  int y;
  int colorState = 2;
  Player player;

  Food(int x, int y, Player player)
  {
    this.x = x;
    this.y = y;
    this.player = player;
  }

  void moveAwayFromPlayer()
  {
    float randomMove = random(1);
    int xDistance = Math.abs(player.x - x);
    int yDistance = Math.abs(player.y - y);


    if (randomMove > 0.40)
    {

      for (int i = 0; i < 4; i++)
      {
        if (xDistance > yDistance)
        {

          if (player.x > food[i].x && x > 0)
          {
            x--;
          } else if (player.x < food[i].x && x < 24)
          {
            x++;
          }
        } else
        {
          if (player.y > food[i].y && y > 0)
          {
            y--;
          } else if (player.y < food[i].y && y < 24)
          {
            y++;
          }
        }
      }
    } else
    {
      probMove();
    }
  }

//food moves in either direction randomly
  void probMove()
  {
    float prob = random(1);
    if (prob > 0.75 && x < 24)
    {
      x++;
    } else if (prob <= 0.75 && x > 0)
    {
      x--;
    } else if (prob <=0.5 && y < 24)
    {
      y++;
    } else if (prob <= 0.25 && y > 0)
    {
      y--;
    }
  }
}
