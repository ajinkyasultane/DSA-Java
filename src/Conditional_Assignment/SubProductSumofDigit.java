package Conditional_Assignment;

import java.util.Scanner;

public class SubProductSumofDigit {
    public static void main(String args[]) {

        int sum = 0;
        int product = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers ");
        int no = sc.nextInt();

        while (no > 0)
        {
            int digit = no % 10;

            sum += digit;
            product*= digit;

            no = no / 10;
        }
        System.out.println("The sum is "+sum);
        System.out.println("The product is "+product);
        System.out.println("The final result is "+(product - sum));
    }
}