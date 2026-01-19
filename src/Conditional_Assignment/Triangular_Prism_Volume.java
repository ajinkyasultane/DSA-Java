package Conditional_Assignment;

import java.util.Scanner;

public class Triangular_Prism_Volume {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base Size");
        float base = sc.nextFloat();

        System.out.println("Enter the Height Size");
        float height = sc.nextFloat();

        float ans = (float) (((double)1/2)* base * height);

        System.out.println(ans);


    }

}
