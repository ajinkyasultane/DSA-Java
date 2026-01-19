package Conditional_Assignment;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String args[])
    {
        System.out.println("To Close a program enter q");
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the base size of triangle");
            float base = sc.nextFloat();

            System.out.println("Enter the Height of a triangle");
            float height = sc.nextFloat();

            float ans = (float)(0.5*(base * height));

            System.out.println("The area of Triangle is "+ans);
            char ch = sc.next().trim().charAt(0);
            if(ch == 'q'|| ch == 'Q')
            {
                break;
            }
        }
    }

}
