package Assigment.FirstJavaLecture;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[])
    {
        float ans = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Operator");
            char op = sc.next().trim().charAt(0);


            if (op == '+'|| op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.println("Enter a num1 and num 2");
                float num1 = sc.nextFloat();
                float num2 = sc.nextFloat();

                ans = num1 + num2;
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("num2 is Zero ");
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            }
            else if(op == 'x' || op == 'X')
            {
                break;
            }
            else
            {
                System.out.println("Invalid Operator");
            }
            System.out.println(ans);
        }
    }

}
