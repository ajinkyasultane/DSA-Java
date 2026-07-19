package SimpleStarting;

public class CountNumber {
    public static void main(String[] args)
    {
        int a = 45553325;
        int n = 5;
        int count = 0;
        while(a > 0)
        {
            int rem = a % 10;
             if(rem == n)
             {
                 count++;
             }
             a = a / 10;
        }

        System.out.println(count);
    }
}
