package BinarySearch;

public class Simple1 {
    public static void main(String[] args)
    {
        int[] arr = {2,3,4,5,6,7,8,9,12,14,15,23,34,45};
        int[] newarr = new int[0];
        int target = 15;
        System.out.println(binarySearch(newarr,target));
    }
    static int binarySearch(int[] arr, int target)
    {
        // no need of this  but it increase codereadablity and efficiency and reduce time
       if(arr.length == 0)
        {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while (start <= end)
        {
        int mid = start + (end - start)/2;

        if(target < arr[mid])
        {
           end  = mid - 1;
        }
        else if (target > arr[mid])
        {
            start = mid+1;
        }
        else return mid;
        }
        return -1;
    }

}


