package Conditional_Assignment;

import java.util.Scanner;

public class SumofNumber {
    public static void main(String args[])
    {
        int ans = 0;
        while (true)
        {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a Numbers");
                int num = sc.nextInt();
                if (num > 0)
                {
                   ans += num;
                }
                else if (num == 0)
                {
                    System.out.println("Program Stop");
                    break;
                }
            System.out.println("The sum of Number is "+ans);
        }
    }

}
