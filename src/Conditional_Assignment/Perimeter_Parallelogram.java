package Conditional_Assignment;

import java.util.Scanner;

public class Perimeter_Parallelogram {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Size Length");
        float d1 = sc.nextFloat();

        System.out.println("Enter the Second Size Length");
        float d2 = sc.nextFloat();

        float ans = 2*(d1 + d2);

        System.out.println(ans);
    }

}
