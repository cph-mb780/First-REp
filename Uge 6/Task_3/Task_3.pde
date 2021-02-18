//Task 3 Mads
//init global variable

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
}

void draw()
{
  //Dont use framrate to control animation
  //-Use frameCounter%100 ie. to time states
  //state 0 red; state 1; red+amber; state 2 green; state 3 amber
  if (state == 100)
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
  } else if (state == 200)
  {

    fill(red);
    ellipse(width/2, height/2 - 150, 150, 150);
    //middle
    fill(amber);
    ellipse(width/2, height/2, 150, 150);
    //bottom
    fill(turnOff);
    ellipse(width/2, height/2 + 150, 150, 150);
  } else if (state == 300)
  {

    fill(turnOff);
    ellipse(width/2, height/2 - 150, 150, 150);
    //middle
    fill(turnOff);
    ellipse(width/2, height/2, 150, 150);
    //bottom
    fill(green);
    ellipse(width/2, height/2 + 150, 150, 150);
  } else if (state == 400)
  {

    fill(turnOff);
    ellipse(width/2, height/2 - 150, 150, 150);
    //middle
    fill(amber);
    ellipse(width/2, height/2, 150, 150);
    //bottom
    fill(green);
    ellipse(width/2, height/2 + 150, 150, 150);
  }
  state++;
  
  //reset state
  if (state > 400)
  {
    state = 0;
  }
}
