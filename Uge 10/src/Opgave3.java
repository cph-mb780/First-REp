public class Opgave3 {

    public void smallestAbsValue(int a, int b, int c)
    {
        int absA= Math.abs(a);
        int absB = Math.abs(b);
        int absC = Math.abs(c);

        int smallestAbsNum = Math.min(absA,Math.min(absB,absC));

        System.out.println(smallestAbsNum);
    }
}
