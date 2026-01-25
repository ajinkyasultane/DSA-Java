package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The rows size of arrays");
        int r = sc.nextInt();

        System.out.println("Enter the column size of arrays");
        int c = sc.nextInt();

        System.out.println("Enter the Element in Arrays");

        int[][]  arr = new int[r][];

        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
            {
                arr[row][col] = sc.nextInt();
            }
        }

//        for (int row = 0; row < arr.length; row++)
//        {
//            for (int col = 0; col <arr[row].length; col++)
//            {
//                System.out.print(arr[row][col]+ " ");
//            }
//            System.out.println();
//        }

        for(int[] e :arr)
        {
            System.out.println(Arrays.toString(e));
        }
    }
}
