package BinarySearch;

import java.util.Arrays;

public class FirstandLastPositionLeet34 {
    public static void main(String[] args)
    {
        int[] arr = {2,3,4,4,4,4,5,6};
        int target = 4;
        System.out.println(Arrays.toString(findFirstAndLastElement(arr,target)));
    }
    static int[] findFirstAndLastElement(int[] nums,int target)
    {
        int[] ans ={-1,-1};
        int start = search(nums,target,true);
        int end = search(nums, target,false );

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    static int search(int[] nums , int target , boolean firstoccurance)
    {
        int ans = -1;
        int start = 0;
        int end = nums.length -1;

        while (start <= end)
        {
            int mid = start + (end - start) /2;
            if (target < nums[mid])
            {
                end = mid -1;
            }
            else if(target > nums[mid])
            {
                start = mid +1;
            }
            else
            {   ans = mid;
                if (firstoccurance)
                {
                    end = mid -1;
                }
                else
                {
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}
