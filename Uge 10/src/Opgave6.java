import java.util.Scanner;

public class Opgave6 {

    public void processName()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Skriv venligst dit fulde navn: ");
        String name = in.nextLine();
        String nameUpper = name.toUpperCase();
        System.out.println("Navnet med store bogbstaver: ");
        System.out.println(nameUpper);
    }
}
