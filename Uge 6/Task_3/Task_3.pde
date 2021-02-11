//Task 3 Mads
//init global variable since draw function updates frame once per cycle
int state = 0;
//3.a
color backGround = color(0);
color red = color(255, 0, 0);
color amber = color(255, 165, 0);
color green = color(0, 255, 0);

//3.b
color turnOff = color(100);


void setup()
{
  size(150, 450);
  background(backGround);
  ellipseMode(CENTER);
  frameRate(1);
}

void draw()
{
  //state 0 red; state 1; red+amber; state 2 green; state 3 amber
  if (state == 0)
  {
    //top
    fill(red);
    ellipse(width/2, height/2 - 150, 150, 150);
    //middle
    fill(turnOff);
    ellipse(width/2, height/2, 150, 150);
    //bottom
    fill(turnOff);
    ellipse(width/2, height/2 + 150, 150, 150);
  } else if (state == 2)
  {

    fill(red);
    ellipse(width/2, height/2 - 150, 150, 150);
    //middle
    fill(amber);
    ellipse(width/2, height/2, 150, 150);
    //bottom
    fill(turnOff);
    ellipse(width/2, height/2 + 150, 150, 150);
  } else if (state == 3)
  {

    fill(turnOff);
    ellipse(width/2, height/2 - 150, 150, 150);
    //middle
    fill(turnOff);
    ellipse(width/2, height/2, 150, 150);
    //bottom
    fill(green);
    ellipse(width/2, height/2 + 150, 150, 150);
  } else if (state == 4)
  {

    fill(turnOff);
    ellipse(width/2, height/2 - 150, 150, 150);
    //middle
    fill(amber);
    ellipse(width/2, height/2, 150, 150);
    //bottom
    fill(turnOff);
    ellipse(width/2, height/2 + 150, 150, 150);
  }
  state++;
  
  //reset state
  if (state > 4)
  {
    state = 0;
  }
}
