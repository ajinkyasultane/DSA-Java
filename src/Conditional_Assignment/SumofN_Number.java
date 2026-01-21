package Conditional_Assignment;

import java.util.Scanner;

public class SumofN_Number {
    public static void main(String args[])
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Number when you want to start");
        int fno = sc.nextInt();

        System.out.println("Enter a Second Number when you want to end");
        int lno = sc.nextInt();

        for (int i = fno ; i <= lno ; i++)
        {
            sum = sum+i;
        }
        System.out.println("The Sum of no is "+ sum);


        int n = (lno - fno)+1;

        int ans = n * (fno + lno)/2;

        System.out.println(n);

        System.out.println("Then Sum of nums is "+ans + "usinng formula");
        sc.close();
    }
}
