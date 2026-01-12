package Assigment.FirstJavaLecture;
import java.util.Scanner;

public class CheckCharacter {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Character for Check a Case of This");
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z')
        {
            System.out.println("Lowercase");
        }
        else
        {
            System.out.println("UpperCase");
        }
    }

}
