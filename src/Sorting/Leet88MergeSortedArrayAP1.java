package Sorting;

import java.util.Arrays;

public class Leet88MergeSortedArrayAP1 {
    public static void main(String[] args)
    {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,4,5};
        int m = 3;
        int n = 3;

         merge(m,n,nums1,nums2);

        System.out.println(Arrays.toString(nums1));

    }
    static void merge(int m , int n , int[] num1, int[] num2)
    {
        int[] ansarray = new int[m+n];

        for(int i = 0; i < m; i++)
        {
            ansarray[i] = num1[i];
        }
        for (int i = 0; i < n; i++)
        {
            ansarray[m + i] = num2[i];
        }

        bubble(ansarray);

        for (int i = 0; i < ansarray.length; i++)
        {
            num1[i] = ansarray[i];
        }
    }

    static void  bubble(int[] arr)
    {
        boolean swapped = false;
        for (int i = 0 ; i < arr.length; i++)
        {
             swapped = false;

             for (int j = 1; j < arr.length; j++)
             {
                 if (arr[j] < arr[j - 1]) {
                     int temp = arr[j];
                     arr[j] = arr[j - 1];
                     arr[j - 1] = temp;
                     swapped = true;
                 }
             }
            if (!swapped)
            {
                break;
            }
        }

    }

}
