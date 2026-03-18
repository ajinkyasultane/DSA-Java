package MathsForDSA;

public class LSBXOR {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,1,2,3};
        System.out.println(LSB(arr));
    }
    static int LSB(int[] arr )
    {
        int unique = 0;

        for(int n : arr)
        {
            unique ^= n;
        }
        return unique;
    }


}
