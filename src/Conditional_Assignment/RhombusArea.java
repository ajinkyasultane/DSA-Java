package Conditional_Assignment;
import java.util.Scanner;

// Area of Rhombus

public class RhombusArea {
    public static void main(String args[])
    {
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter q for exit program");

            System.out.println("Enter the diagonal 1st size");
            float d1 = sc.nextFloat();

            System.out.println("Enter the 2nd diagonal Size");
            float d2 = sc.nextFloat();

            float area = (float)(0.5*(d1 * d2));

            System.out.println("The area of Rhombus is "+ area);
            char ch = sc.next().trim().charAt(0);

        }
    }

}
