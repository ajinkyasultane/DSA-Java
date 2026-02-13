package Sorting;

import java.util.Arrays;

public class Leet645SetMismatch
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(setmismatch(arr)));

    }
    static int[] setmismatch(int[] nums)
    {
        int[] ans = new int[nums.length /2];
        int i = 0;
        while (i < nums.length)
        {
            int correct =nums[i] - 1;

            if (nums[i] != nums[correct])
            {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else
            {
                i++;
            }
        }
        for (int index =0; index < nums.length ; index++)
        {
            if (nums[index] != index+1)
            {
                return ans = new int[] {nums[index] , index +1};
            }

        }
        return new int[] {-1 ,-1};
    }
}
