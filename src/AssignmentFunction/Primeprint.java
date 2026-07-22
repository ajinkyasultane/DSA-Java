package AssignmentFunction;

public class Primeprint {
    public static void main(String[] args)
    {
        for(int i = 2; i<= 100; i++)
        {
            int c = 2;
            boolean isprime = true;
            while (c*c <= i)
            {
                if (i % c == 0)
                {
                    isprime = false;
                    break;
                }
                c++;

            }
            if (isprime)
            {
                System.out.print(i + " ");
            }
        }
    }
}
