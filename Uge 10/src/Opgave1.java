import java.util.Scanner;

public class Opgave1 {

    //Opgave 1:
    //    Skriv en metode der hedder min som tager tre integers som parametre og returnerer den mindste af de tre værdier.
    //    For eksempel vil et kald til min (3, -2, 7) returnere -2, og et kald til min(19, 27, 6) returnere 6.
    //    Brug Math.min i din løsning.


    public int findSmallest(int num1, int num2, int num3)
    {
        int smallest = Math.min(num1,Math.min(num2,num3));
        return smallest;
    }


}