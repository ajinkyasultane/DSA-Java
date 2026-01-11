package Assigment.FirstJavaLecture;
import java.util.Scanner;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimpleIntrest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        float principal = sc.nextFloat();

        System.out.println("Enter a Times period of years");
        float times = sc.nextFloat();
        float month = (float)(times * 1.20);
        System.out.println("Enter a rate of Intrest");
        float intrest = sc.nextFloat();

        float result =( principal * intrest * month )/ 100;

        System.out.println("The intrest of a "+principal +" Amount is "+result);
        System.out.println(month);
    }

}
