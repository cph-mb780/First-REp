public class Main {

    public static void main(String[] args) {
	// write your code here
        printIfPalindrome("abb Bba");
    }

    public static void printIfPalindrome(String sentence)
    {
        String lowerSentence = sentence.toLowerCase();

        boolean isPalindrome = false;
        int i = 0;
        int j = lowerSentence.length()-1;

        while(i != j)
        {
            if(lowerSentence.charAt(i) == lowerSentence.charAt(j))
            {
                isPalindrome = true;
            } else
            {
                isPalindrome = false;
            }
            i++;
            j--;
        }


        if(isPalindrome)
        {
            System.out.println(sentence + "\n Is a palindrome!");
        } else
        {
            System.out.println(sentence + "\n Is not a palindrome!");
        }
    }
}
