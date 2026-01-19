package Conditional_Assignment;
import java.util.Scanner;

//Volume of Cyclinders

public class Volume_of_Cylinders {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Radius");

        float radius = sc.nextFloat();

        float ans = 0;
        ans = (float)(((double)4/3)*22/7*radius*radius*radius);

        System.out.println(ans);

    }
}
