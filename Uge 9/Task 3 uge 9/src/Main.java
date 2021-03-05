public class Main {

    public static void main(String[] args) {
        // write your code here
        printPartOfWord("København", 6,4 );
    }

    public static void printPartOfWord(String word, int start, int stop) {


        try {
            System.out.println(word.substring(start, stop));


        } catch (StringIndexOutOfBoundsException e) {
            if(start < word.length() && start + stop+1 > word.length())
            {
                System.out.println(word.substring(start));

            } else if (start > word.length() || stop > word.length())
            {

                System.out.println("Number is too high, please try with a smaller number.");
            } else {
                System.out.println(e.getMessage());
            }
        }

    }
}
