package Linear_Search;

public class SimpleLinearSearch {
    public static void main(String[] args)
    {
        int[] arr = {12,32,343,65,54,76,34,77,89};
        int target = 656;
        System.out.println(linearSearch(arr,target));
    }
    static int linearSearch(int[] nums,int target)
    {
        if(nums.length == 0)
        {
            return -1;
        }
        for (int i = 0; i < nums.length; i++)
        {
            int element = nums[i];
            if (element == target)
            {
                return i;
            }
        }
        return -1;
    }
}
