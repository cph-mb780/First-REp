import java.util.Scanner;

public class Opgave8
{
    Scanner in = new Scanner(System.in);


    public String smallestName(int n)
    {

        String [] names = new String[n];
        int counter = 1;

        String smallest;


        for (int i = 0; i < names.length; i++)
        {

            System.out.println("Navn#" + counter + "? ");

            names[i] = in.nextLine();
            counter++;
        }
        smallest = names[0];

        for(int j = 0; j < names.length; j++)
        {
            if (names[j].length() < smallest.length()) {
                smallest = names[j];
            }
        }

        return smallest;
    }

}
