public class Opgave4 {

    public int sumDigits(int a)
    {
        int absA = Math.abs(a);
        int sum = 0;
        int rem = 0;

        while(absA > 0)
        {
            rem = absA%10;
            System.out.println(rem);
            sum = sum + rem;
            absA = absA/10;
            System.out.println(absA);




        }

    return sum;

    }


}
