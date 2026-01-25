package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArrray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Arrays you want to print");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the element in Arrays");


        for (int i = 0; i< arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
//        for (int i = 0; i< arr.length; i++)
//        {
//            System.out.print(arr[i]+" ");
//        }

        for (int pri : arr)
        {
            System.out.print(pri + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
