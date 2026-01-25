package Arrays;

import java.util.Arrays;

public class MaxMininArray {
    public static void main(String[] args)
    {
        int[] arr = {8,7,54,32,31,6,59};
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));

        System.out.println(maxinrange(arr, 1, 5));
        System.out.println(min(arr));
    }
    static int max(int[] arr)
    {
    int max  = arr[0];
        for (int i = 0; i < arr.length; i++)
        {

            if (max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }

    static int maxinrange(int[] arr , int start, int end)
    {
        int max = arr[start];
        for (int i = start; i <= end ; i++)
        {
            if (max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
    static int min(int[] arr)
    {
        int min  = arr[0];
        for (int i = 0; i < arr.length; i++)
        {

            if (min > arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }

}
