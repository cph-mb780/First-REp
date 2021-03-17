public class Opgave11 {

    public void printMultiple(int n)
    {
        int sum = 0;

        for (int i = 0; i < 9; i++)
        {
            sum = sum + n;
            System.out.printf("%d og ",sum);
        }
        System.out.println(sum+n);
    }
}
