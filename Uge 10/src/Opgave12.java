public class Opgave12 {

    public int max(int[] intArray)
    {
        int maxValue = 0;
        for (int i = 0; i< intArray.length; i++)
        {
            if(intArray[i]> maxValue)
            {
                maxValue = intArray[i];
            }
        }


        return maxValue;

    }
}
