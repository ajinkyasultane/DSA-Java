package Conditional_Assignment;

import java.util.Scanner;

public class VolumeofCone {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of radius");
        float radius = sc.nextFloat();

        System.out.println("Enter the Height of Cone");
        float height = sc.nextFloat();

        float ans = 0;

        ans = (float) (((double) 1/3)*22/7 * radius * radius * height);

        System.out.println(ans);

        sc.close();
    }
}
