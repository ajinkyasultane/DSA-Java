package AssignmentFunction;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No check prime or not");
        int no = sc.nextInt();

        boolean ans = isprime(no);
        System.out.println(ans);
        int count = 0;
        for (int i = 1; i <= 100; i++)
        {
            if (isprime(i)) {
                System.out.print(i + " ");

            }


        }

    }
    static boolean isprime(int no)
    {
        if (no <=1)
        {
            return false;
        }
        int c = 2;
        while (c*c <= no)
        {
            if (no % c == 0)
            {
                return false;
            }
            c++;
        }
        return c*c > no;
    }

}
