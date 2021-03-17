
public class Opgave5 {

    public void reverseVertical(String word)
    {
        for (int i = word.length()-1; i >= 0 ; i--)
        {
            char letter = word.charAt(i);
            System.out.println(letter);

        }
    }
}
