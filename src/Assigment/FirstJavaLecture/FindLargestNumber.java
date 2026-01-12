package Assigment.FirstJavaLecture;
import java.util.*;
public class FindLargestNumber {
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter First no");
        float no1 = sc.nextFloat();

        System.out.println("Enter Second no");
        float no2 = sc.nextFloat();

        System.out.println("Enter Third no");
        float no3 = sc.nextFloat();

        //float max = no1;

        if(no1 > no2 && no1 > no3)
        {
            System.out.println(no1 +" Is Greater no");
        }
        else if(no2 > no1 && no2 > no3)
        {
            System.out.println(no2+" Is Greater no");
        }
        else {
            System.out.println(no3 +" Is Greater no");
        }
    }

}
