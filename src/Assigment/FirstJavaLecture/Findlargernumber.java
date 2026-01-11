package Assigment.FirstJavaLecture;
import java.util.Scanner;

//Take 2 numbers as input and print the largest number.

public class Findlargernumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a FIrst number ");
        float num1 = sc.nextFloat();

        System.out.println("Enter a Second Number");
        float num2 = sc.nextFloat();

        if(num1 > num2)
        {
            System.out.println("Maximum no is : "+num1);
        }
        else if(num1 < num2)
        {
            System.out.println("Maximum no is " +num2);
        } else  {
            System.out.println("Both no are same");

        }
    }

}
