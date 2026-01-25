package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArray1String {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of String Arrays");
        int len = sc.nextInt();

        String[] arr = new String[len];

        System.out.println("Enter the Element in A String Arryas ");
        for (int i = 0 ; i < arr.length; i++)
        {
            arr[i] = sc.next();
        }

        System.out.println(Arrays.toString(arr));
        change(arr);

        for (String a : arr)
        {
            System.out.print(a);
        }
    }
    static void change(String[] nums)
    {
        nums[0]="Shamrao";
    }

}
