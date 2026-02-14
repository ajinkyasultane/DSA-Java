package Sorting;

import java.util.ArrayList;
import java.util.List;

public class Leet442FindAllDuplicateElement
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,2,3,5,6};
        List<Integer> ans = findDuplicates(arr);
        System.out.println(ans);
    }

    static List<Integer> findDuplicates(int[] nums)
    {
        ArrayList<Integer> anslist = new ArrayList<>();

        int i = 0;

        while (i < nums.length)
        {
            int correct = nums[i] - 1;
            if (nums[i] < nums.length && nums[i] != nums[correct])
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

        for (int index = 0 ; index < nums.length ; index++)
        {
            if (nums[index] != index +1 )
            {
                anslist.add(nums[index]);
            }
        }
        return anslist;
    }

}
