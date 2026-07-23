package AssignmentFunction;

import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args)
    {
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter a no to check armstrong or not");
//        int n = sc.nextInt();
//    boolean ans = armstrong(n);
//        System.out.println(ans);

        for (int i = 1; i < 1000; i++)
        {
            if (armstrong(i))
            {
                System.out.println(i);
            }
        }

    }
    static boolean armstrong(int n)
    {
        int original = n;
        int sum = 0;
        while (n > 0)
        {
            int rem = n % 10;
            n = n/10;
            sum = sum + rem * rem * rem ;

        }
        return sum ==original;
    }
}
