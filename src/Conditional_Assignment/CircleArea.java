package Conditional_Assignment;
import java.util.Scanner;

//Area Of Circle Java Program

public class CircleArea {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Radius");
        float radius = sc.nextFloat();

        float area = (float) ((3.14 ) * radius * radius);
        System.out.println("The Area of circle is "+area);

    }

}
