package AssignmentFunction;

import java.util.Scanner;

public class Isprime {
    public static void main(String[] args)
    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a no for check prime or not");
//        int n = sc.nextInt();
//        int n = 25;
//        boolean ans = isprime(n);
//        System.out.println(ans);

        for (int i = 0; i < 100; i++)
        {
            if (isprime(i))
            {
                System.out.print(i + " ");
            }
        }

    }
    static boolean isprime(int n)
    {
        if (n <= 1)
        {
            return false;
        }
        int c = 2;
        while (c*c <= n)
        {
            if (n % c == 0)
            {
                return false;
            }
            c++;
        }
        return c*c > n;
    }

}
