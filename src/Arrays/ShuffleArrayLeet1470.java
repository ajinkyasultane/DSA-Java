package Arrays;

//1470. Shuffle the Array
//Example 1:
//
//Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7]
//Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

import java.util.Arrays;

public class ShuffleArrayLeet1470 {
    public static void main(String[] args)
    {
        int[] arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr)));

    }
    static int[] shuffle(int[] nums)
    {
       int n = nums.length /2;
        int[] ans = new int[2*n];
        int[] xi = new int[n];
        int[] yi = new int[n];
        int j = 0;
        for (int i = 0; i< n; i++)
        {
            xi[i] = nums[i];
        }
        for (int i = n; i<nums.length; i++)
        {
            yi[j] = nums[i];
            j++;
        }

        for (int  i = 0 ; i < n; i++)
        {
            ans[2*i] = xi[i];
            ans[2*i+1] = yi[i];
        }
        return ans;
    }
}
