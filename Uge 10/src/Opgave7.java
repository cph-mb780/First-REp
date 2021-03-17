public class Opgave7 {
    public String repeat(String str)
    {
        int strLength = str.length();
        String emptyString = "";

        if (strLength == 0)
        {
            return emptyString;
        }
        String repeated = str.repeat(strLength);
        return repeated;


    }
}
