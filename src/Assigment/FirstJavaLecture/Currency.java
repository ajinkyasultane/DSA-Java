package Assigment.FirstJavaLecture;
import java.util.Scanner;

//Input currency in rupees and output in USD.

public class Currency {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Indian Rs Value which we transform into USD");
        float currency = sc.nextFloat();

        float usd = (currency / 89);

        System.out.println("The value of indian rs "+currency+ " is "+usd +" in USD");

    }
}
