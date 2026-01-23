package BasicProgram;

import java.util.Scanner;

public class Function1 {
    public static void main(String args[])
    {
        System.out.println(sum());
        System.out.println(sum2(20 , 70));
        String name = "Ajinkya Sultane";
        System.out.println(greeting(name));
    }
    static int sum()
    {
        int num1, num2 , countsum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 value");
        num1 = sc.nextInt();

        System.out.println("Enter the num2 value");
        num2 = sc.nextInt();

        countsum = num1 + num2;

        return countsum;
    }
    static int sum2(int no1 , int no2)
    {
        int result = no1 + no2;
        return result;
    }
    static String greeting(String name)
    {
        String output = "Hello "+name;
        return output;
    }

}
