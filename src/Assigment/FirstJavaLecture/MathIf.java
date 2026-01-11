package Assigment.FirstJavaLecture;
import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class MathIf {
    public static void main(String args[])
    {
        int i = 0;
        System.out.println("Enter a How many Iteration you want");
        Scanner in = new Scanner(System.in);
        int interation = in.nextInt();
        while (i!=interation) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number");
            float num1 = sc.nextFloat();

            System.out.println("Enter Second Number");
            float num2 = sc.nextFloat();

            System.out.println("Enter what you want like a + , - , * , /");
            String symbols = sc.next();
            if (symbols.equals("+"))
            {
                float sum = num1 + num2;
                System.out.println("The Addtion of two no is " +sum);
            }
            else if(symbols.equals("-"))
            {
                float sub = num1 - num2;
                System.out.println("The Substraction of two no is "+sub);
            }
            else if(symbols.equals("*"))
            {
                float mul = num1 * num2 ;
                System.out.println("The Multiplication is "+mul);
            }
            else if (symbols.equals("/"))
            {
                float div = num1 / num2;
                System.out.println("The Division is "+div);
            }
            else
            {
                System.out.println("you Enter invalid Symbols please enter + - * /");
            }
        i++;
        }

    }

}
