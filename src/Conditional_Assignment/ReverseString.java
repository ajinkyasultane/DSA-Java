package Conditional_Assignment;
import java.util.Scanner;

//Reverse String in java
public class ReverseString {
    public static void main(String args[])
    {
        String reverse = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String name = sc.nextLine();

        for(int i = name.length()-1 ; i>= 0; i--)
        {
            reverse = reverse + name.charAt(i);
        }
        System.out.println("The Reverse String is "+reverse);
    }
}
