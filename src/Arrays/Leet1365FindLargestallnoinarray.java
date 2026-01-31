package Arrays;

//1365. How Many Numbers Are Smaller Than the Current Number
//Example 1:
//
//Input: nums = [8,1,2,2,3]
//Output: [4,0,1,1,3]
//Explanation:
//For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
//For nums[1]=1 does not exist any smaller number than it.
//For nums[2]=2 there exist one smaller number than it (1).
//For nums[3]=2 there exist one smaller number than it (1).
//For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).

import java.util.Arrays;

public class Leet1365FindLargestallnoinarray {
    public static void main(String[] args)
    {
        int[] arr = {2,4,1,9,2,1};
        System.out.println(Arrays.toString(findLarge(arr)));
    }
    static int[] findLarge(int[] nums)
    {
    int n = nums.length;
    int[] ans = new int[n];

    for (int i =0; i<n; i++)
    {
        int count = 0;
        for(int j = 0; j<n; j++)
        {
            if(nums[j] < nums[i])
            {
                count++;
            }
        }
        ans[i] = count;
    }
    return ans;
    }
}
