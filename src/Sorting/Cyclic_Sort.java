package Sorting;

import java.util.Arrays;

public class Cyclic_Sort
{
    public static void main(String[] args)
    {
        int[] arr = {3,5,2,1,4};
        cyclic_sortwhile(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclic_sortfor(int[] arr)
    {
        for (int i = 0 ; i < arr.length ;)
        {
           int correct = arr[i] - 1;
           if (arr[i] != arr[correct])
            {
                int temp  = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else
            {
                i++;

            }
        }
    }

    static void cyclic_sortwhile(int[] arr)
    {
        int i =0;
        while (i < arr.length)
        {
            int correct = arr[i] -1;
            if (arr[i] != arr[correct])
            {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct]= temp;
            }
            else
            {
                i++;
            }
        }
    }
}
