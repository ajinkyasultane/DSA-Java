package Conditional_Assignment;
import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int no = sc.nextInt();

        int original = no;
        int count = 0;

        while (no > 0)
        {
            count++;
            no /= 10;
        }

        no= original;
        int sum = 0;
        int rem = 0;
        int power = 1;

        while (no > 0)
        {
             rem = no % 10;
             power = 1;

            for (int i = 1; i<= count; i++)
            {
               power =  power * rem;
            }

            sum += power;
            no /= 10;

        }
        System.out.println("the value of "+rem);
        System.out.println("The sum is " +sum);
        System.out.println("The power is "+ power);


        if(sum == original)
        {
            System.out.println("The no is Armstrong numbers");
        }
        else
        {
            System.out.println("The no is not a Armstrong numbers");
        }


    }

}
