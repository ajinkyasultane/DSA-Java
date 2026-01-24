package AssignmentFunction;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no which you want to find factorial");
        int no = sc.nextInt();

        System.out.println(factorial(no));
    }
    static int factorial(int no)
    {
        int ans = 1;
        for (int i = no; i>=1; i--)
        {
             ans *= i;
        }
        return ans;
    }
}
