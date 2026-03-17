package MathsForDSA;

public class BitwiseAnd {
    public static void main(String[] args)
    {
        System.out.println(isodd(99));
    }
    static boolean isodd(int n)
    {
        return (n & 1) == 1;
    }

}
