import java.util.Scanner;

public class Opgave10 {

    public void maxMin()
    {
        Scanner in = new Scanner(System.in);
        int input = 0;
        int min = 999;
        int max = 0;

        while (input != -1)
        {
            System.out.println("Skriv et tal (eller -1 for at afslutte): ");
            input = in.nextInt();

            if(input < min && input != -1)
            {
                min = input;
            } else if (input > max)
            {
                max = input;
            }
        }
        System.out.printf("Maximum var: %d \nMinimum var: %d",max, min);
    }
}
