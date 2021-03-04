// 2.a Look at the file TaskTwoA and fill out the missing line, using the happy boolean. 
// 2.b Write a function that receives to integers as parameters and returns the sum of them.
// 2.c Write a function that receives a string and returns it as uppercase. (Hint: ".toUpperCase()". Further hint: https://www.w3schools.com/jsref/jsref_toUpperCase.asp )
// 2.d Write a function that receives a string and returns true if the first letter of the string is uppercase. (Hints: ".charAt(0)" and "Character.isUpperCase('a');" )


class Main{
  public static boolean happy = true;

  public static void main(String [] args) {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands"); 
   }

   System.out.println(sum(3, 4));

   System.out.println(toUpper("dette er skrevet i lowercase"));

   


   if(firstChar("mAds"))
   {
    System.out.println("First letter IS uppercase");
   } else
   {
    System.out.println("First letter is NOT uppercase");
   }
   
 }


 public static boolean iAmHappy()
 {
  // fill out what is missing here: 
  if(happy == true)
  {
    return true;
  } else
  {
    return false;
  }
  
}

public static int sum(int a, int b)
{
  int sum = a + b;
  return sum;
}

public static String toUpper(String inputLower)
{
  String lower = inputLower;
  String upper = lower.toUpperCase();
  return upper;
}

/* 2.d Write a function that receives a string and returns true if the first letter of the string is uppercase.
(Hints: ".charAt(0)" and "Character.isUpperCase('a');" )*/

public static boolean firstChar(String isFirstUpper)
{
  String letter = isFirstUpper;
  char first = letter.charAt(0);


  if (Character.isUpperCase(first))
  {
    return true;
  } else
  {
    return false;
  }
}
}