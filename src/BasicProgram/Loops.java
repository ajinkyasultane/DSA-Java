package BasicProgram;

import java.util.Scanner;

public class Loops {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number starting of a series");
        int num1 = sc.nextInt();
        System.out.println("Enter the number ending of a series");
        int num2 = sc.nextInt();

//        while (num1 <= num2)
//        {
//            System.out.println(num1);
//            num1++;
//        }

        for(int i = num1; i <= num2 ; i++)
        {
            System.out.println(i);
        }
    }
}
