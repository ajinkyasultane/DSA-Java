package Sorting;

import java.util.List;
import java.util.ArrayList;

public class Leet448MissingAllNo {
    public static void main(String[] args)
    {
      int[] arr = {1,2,3,4,7,8};
      List<Integer> ans = findDisappearedNumbers(arr);
        System.out.println(ans);
    }

     static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        ArrayList<Integer> missing = new ArrayList<>();

        while(i < nums.length)
        {
            int correct = nums[i] -1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct])            {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else
            {
                i++;
            }
        }
        for(int index = 0; index < nums.length ; index++)
        {
            if(nums[index]!= index+1)
            {
                missing.add(index+1);
            }
        }
        return missing;
    }
}


