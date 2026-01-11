package Assigment.FirstJavaLecture;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many times you want to check number");
        int times = in.nextInt();
        int i = 0;
        while (i != times) {
            System.out.println("Enter a Number to check it is even or odd");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("The no " + num + " is even number");
            } else {
                System.out.println("The no " + num + " is odd number");
            }

            i++;
        }
    }
}
