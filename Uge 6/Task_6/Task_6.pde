//Task 6
//6.a


//int a = 0;
//int b = 0;

//if (a == 10 || b == 10 || a + b == 10)
//{
//  println("Success!");
//} else 
//{
//  println("Failure!");
//}


//6.b
int x = 20;
int y = 2;
int z = 8;

boolean passTest = true;

if (x == 10 || x == 20 || x == 30)
{
  passTest = false;
} else if (y == 10 || y == 20 || y == 30)
{
  passTest = false;
} else if (z == 10 || z == 20 || z == 30)
{
  passTest = false;
}

if (passTest == true && x + y + z == 30)
{
  println("Success!");
} else
{
  println("failure!");
}
