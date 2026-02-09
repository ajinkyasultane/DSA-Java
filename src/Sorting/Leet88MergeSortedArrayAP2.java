package Sorting;

import java.util.Arrays;

public class Leet88MergeSortedArrayAP2 {
    public static void main(String[] args)
    {
        int[] nums1 = {1,2,3,0,0,0};
        int m =3;
        int n = 3;
        int[] nums2 = {2,4,5};
        merge(m,n,nums1,nums2);

        System.out.println(Arrays.toString(nums1));
    }
    static void merge(int m , int n , int[] nums1, int[] nums2)
    {
        for(int i = 0; i < n ; i++)
        {
            nums1[m + i]  = nums2[i];
        }
        bubble(nums1);
    }

    static void bubble(int[] arr)
    {
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++)
        {
            swapped = false;

            for (int j = 1; j < arr.length -i; j++)
            {
                if (arr[j] < arr[j -1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j-1] = temp;
                    swapped =true;
                }
            }
            if (!swapped)
            {
                break;
            }
        }
    }
}
