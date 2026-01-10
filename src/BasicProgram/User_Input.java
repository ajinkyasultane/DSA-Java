package BasicProgram;
import java.util.Scanner;
public class User_Input {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Your age is " + age);


        sum2number();
    }

    public static int sum2number() {
        Scanner sum = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = sum.nextInt();
        System.out.println("Enter Second Number");
       int num2 = sum.nextInt();
int ans;
          ans = num1 + num2;
        System.out.println(ans);
        return -1;
            }
}