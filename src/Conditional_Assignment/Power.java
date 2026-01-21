package Conditional_Assignment;

import java.util.Scanner;

public class Power {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No you want to calculate power");
        int number = sc.nextInt();

        System.out.println("Enter the power value you want to get you");
        int inpower = sc.nextInt();
        int ans = 1;
        for (int i = 1; i<= inpower; i++)
        {
            ans *= number;
        }
        System.out.println("The power is "+ans);
    }

}
