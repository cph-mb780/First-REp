import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    private static String[][] text = new String[12][1];

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/data.txt");
        scan = new Scanner(file);
        int i = 0;
        while (scan.hasNextLine()) {
            text[i] = scan.nextLine().split(" ");

            i++;
        }

        // todo: print alle ord der starter med det der sendes med som argument,
        printWordsStartingWith("Ø");
        //todo: print alle ord der har præcis det antal bogstaver der sendes med som argument (inkluderer IKKE tal og tegnene '.' og ',')
        printWordsOfLength(3);


        //test dine metoder ved at kalde dem her:
        printWordsWithDoubleConsonant ();


    }

    private static void printWordsOfLength(int l) {
        boolean wordisvalid = true;

        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                if (s.length() == l) {
                    if (s.contains(",") || s.contains(".")) {
                        wordisvalid = false;
                    }
                     /*for (int j = 0; j < s.length(); j++) {
                         char c = s.charAt(j);
                         if(c == '.' || c == ','){
                             wordisvalid = false;
                         }
                     }*/
                    if (wordisvalid) {
                        System.out.println(s);
                    }

                }
            }
        }

    }

    private static void printWordsStartingWith(String pattern) {

        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                    System.out.println(s);
                }
            }

        }

    }

    //skriv dine metoder herunder:
    /*runs through row word, then char and if isConsonant is true

     */
    public static void printWordsWithDoubleConsonant() {
        for (int i = 0; i < text[i].length; i++) {
            for (String s : text[i]) {
                for (int j = 0; j < s.length(); j++) {
                    char k = s.charAt(j);
                    if (isConsonant(k) && j > 0) {
                        char prevChar = s.charAt(j - 1);
                        if (k == prevChar)
                        {
                            System.out.println(s);
                        }
                    }
                }

            }
        }
    }

    //checking if char is a consonant TODO: check Index 12 out of bounds for length 12
    public static boolean isConsonant(char x) {
        char c = Character.toLowerCase(x);
        if (x =='b' || x =='c'|| x =='d' || x =='f' || x =='g' || x =='h' || x =='j' || x =='k' || x =='l' ||x =='m'
                || x =='n' || x =='p' || x =='q' || x =='r' || x =='s' || x =='t'|| x =='v' || x =='w' || x =='x' || x =='z')
        {
            return true;
        } else
        {
            return false;
        }

    }

}
