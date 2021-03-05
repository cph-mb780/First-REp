import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    private static String [][] text = new String[12][1];

    public static void main(String[] args) throws FileNotFoundException {

        // write your code here
        String longSentence = getLongest();
        System.out.println("The longest sentence is: " +longSentence + "\n with a length of: " + longSentence.length());


    }

    public static String getLongest() throws FileNotFoundException {
        String longestSentence = " ";
        File file = new File("src/data.txt");
        scan = new Scanner(file);
        int i = 0;
        while (scan.hasNextLine()) {
            // text[i] = scan.nextLine().split(" ");
           String [] text = scan.nextLine().split("\\. ");
           longestSentence = text[0];
           for (String sentence : text)
            {
                if(sentence.length() > longestSentence.length())
                {
                    longestSentence = sentence;

                }
            }
            i++;
        }
        return longestSentence;
    }



}
