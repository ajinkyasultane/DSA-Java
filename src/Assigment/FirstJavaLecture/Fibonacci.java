package Assigment.FirstJavaLecture;
import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.

public class Fibonacci {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for calculate a Fibonacci Series");
        int num = sc.nextInt();

        int prev1 = 1;
        int prev2 = 0;

        for(int i = 1; i <= num ; i++) {
            if (i > 2) {
                int curr = prev1 + prev2;
                prev2 = prev1;
                prev1 = curr;
                System.out.print(curr + " ");
            }
            else if(i == 1)
            {
                System.out.print(prev2 + " ");
            }
            else if(i == 2)
            {
                System.out.print(prev1+ " ");
            }
        }
    }

}
