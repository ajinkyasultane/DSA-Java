package AssignmentFunction;
import java.util.Scanner;
public class Checkpalindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String abc = sc.next();

        palindrome(abc);
    }
    static void palindrome(String ab)
    {
        String reverse = "";
        for (int i = ab.length()-1; i >= 0; i--)
        {
            reverse = reverse + ab.charAt(i);
        }
        if (reverse.equals(ab))
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not a Palindrome");
        }
    }

}
