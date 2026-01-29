package BinarySearch;

public class FloorofNoLeetProblem {
    public static void main(String[] args)
    {
        int[] arr = {2,3,4,5,7,8,12,15,19,31};
        int target =6;
        System.out.println(floorNo(arr,target));
    }
    static int floorNo(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length -1;

        while (start <= end)
        {
            int mid = start + (end -start) /2;

            if(target == arr[mid]){
                return mid;
            }
            if(target < arr[mid])
            {
               end = mid -1;
            }
            if (target > arr[mid])
            {
                start = mid+1;
            }

        }
        return end;
    }
}
