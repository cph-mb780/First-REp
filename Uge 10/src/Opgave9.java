import java.util.Random;

public class Opgave9 {



    public void randomNumbers()
    {
        int rnd=0;
        while (rnd < 900)
        {
            rnd = (int)(Math.random() * 1000);
            System.out.println("Random number: " + rnd);
        }



    }


}
