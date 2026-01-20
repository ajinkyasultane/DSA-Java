package Conditional_Assignment;

import java.util.Scanner;

public class Fibonnacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number where you want to print a Fibonnacci Series");
        int n = sc.nextInt();


        int prev1= 1;
        int prev2 = 0;

        for (int i = 1 ; i <= n ; i++)
        {
            if (i > 2)
            {
                int curr = prev1 + prev2;
                prev2 = prev1;
                prev1 = curr;

                System.out.print(curr + " ");
            }
             if (i == 1)
            {
                System.out.print(prev2 + " ");
            }
            if (i == 2)
            {
                System.out.print(prev1+ " ");
            }
        }
    }

}
