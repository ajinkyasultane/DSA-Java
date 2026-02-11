package Sorting;

import java.util.Arrays;

public class Leet268MissingNumber {
    public static void main(String[] args)
    {
        int[] arr = {1,4,3,2,5,7};
        System.out.println( missing_number(arr));

    }
    static int   missing_number(int[] arr)
    {
        int i = 0;
        while (i < arr.length)
        {
            int correct = arr[i] - 1;

            if (arr[i] < arr.length && arr[i] != arr[correct])
            {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else {
                i++;
            }
        }
        for (int index = 0; index < arr.length ; index++)
        {
            if (arr[index] != index + 1)
            {
                return index +1;
            }

        }
        return arr.length+ 1;
    }
}
