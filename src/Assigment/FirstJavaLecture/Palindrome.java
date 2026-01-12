package Assigment.FirstJavaLecture;
import java.util.Scanner;

//To find out whether the given String is Palindrome or not.

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter How many String you want to check");
        int no = sc1.nextInt();
        int j = 1;

        while (j <= no) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String check it is palindrome or not");
            String palin = sc.nextLine();
            String rev = "";

            for (int i = palin.length() - 1; i >= 0; i--) {
                rev = rev + palin.charAt(i);
            }
            if (palin.equals(rev)) {
                System.out.println("String is palindrome");
            } else {
                System.out.println("String is not palindrome");
            }
            j++;


        }
    }


}
