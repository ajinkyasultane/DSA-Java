package AssignmentFunction;

import java.util.Scanner;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class CheckMinMax {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three no for check min and max");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        int no3 = sc.nextInt();

        System.out.println("The maximum no is "+  max(no1,no2,no3));
        System.out.println("The minimun no is "+ min(no1,no2,no3));

    }
    static int max(int no1, int no2, int no3)
    {
//        int max = no1;
//        if (max < no2)
//        {
//            max = no2;
//        }
//        if (max < no3)
//        {
//            max = no3;
//        }
//        return max;
       int ans =  Math.max(no1,Math.max(no2,no3));
        return ans;
    }

    static int min(int no1, int no2, int no3)
    {
//        int min = no1;
//        if(min > no2)
//        {
//            min = no2;
//        }
//        if (min > no3)
//        {
//            min = no3;
//        }
//        return min;

        int ans = Math.min(no1,Math.min(no2,no3));
        return ans;
    }



}
