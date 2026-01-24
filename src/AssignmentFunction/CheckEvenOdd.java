package AssignmentFunction;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No");
        int no = sc.nextInt();
checkevenodd(no);
    }
    static void checkevenodd(int no)
    {
        if (no % 2 == 0)
        {
            System.out.println("No is Even");
        }
        else{
            System.out.println("No is Odd");
        }
    }
}
