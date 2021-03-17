public class Opgave13 {
    public boolean allLess(int[] arrayA, int[] arrayB)
    {
        try{
        for (int i = 0; i < arrayA.length; i++)
        {
            if(arrayA[i] != arrayB[i])
            {
                return false;
            }
        }
        return true;
    } catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);

            return false;
        }
    }
}
