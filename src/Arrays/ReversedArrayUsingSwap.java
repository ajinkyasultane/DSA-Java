package Arrays;

import java.util.Arrays;

public class ReversedArrayUsingSwap {
    public static void main(String[] args)
    {
        int[] arr = {1,43,54,34,59,40};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseArray(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1 , int index2)
    {
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2] = temp;
    }
}
