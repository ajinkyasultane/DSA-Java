package AssignmentArrays;

import java.util.Arrays;

public class LeetCode1920O1 {
    public static void main(String[] args)
    {
        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }
    static int[] buildArray(int[] nums)
    {
        int n = nums.length;

        for (int i = 0; i < n; i++)
        {
            nums[i] += n * (nums[nums[i]] % n);
        }
        for (int i = 0 ; i < n; i++)
        {
            nums[i] /= n;
        }
        return nums;
    }
}
