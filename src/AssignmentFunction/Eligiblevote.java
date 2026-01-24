package AssignmentFunction;

import java.util.Scanner;

public class Eligiblevote {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        checkeligiblity(age);
    }

    static void checkeligiblity(int age)
    {
        if (age >= 18)
        {
            System.out.println("you are eligible for vote");
        }
        else
            System.out.println("you are not eligible for vote");

    }

}
