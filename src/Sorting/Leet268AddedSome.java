package Sorting;

import java.util.Arrays;

public class Leet268AddedSome {
    public static void main (String[] args)
    {
        int[] arr = {10,11,12,13,14,16,17};
        System.out.println(missingnumber(arr));

    }
    static int missingnumber(int[] arr)
    {
        int start = 10;
        int i = 0;
        while (i < arr.length)
        {
            int correct = arr[i] - start;
            if (arr[i] < arr.length && arr[i] != arr[correct])
            {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;

            }
            else
            {
                i++;
            }
        }
        for (int index =0 ; index< arr.length; index++)
        {
            if (arr[index] != index + start)
            {
                return index+start;
            }
        }
        return arr.length+start;
    }
}
