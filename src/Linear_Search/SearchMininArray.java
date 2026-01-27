package Linear_Search;

public class SearchMininArray
{
    public static void main(String[] args)
    {
        int[] arr = {323,54,32,58,95,43,3};
        System.out.println(min(arr));
        System.out.println(findminindex(arr));
    }
    static int min(int[] nums)
    {
        if (nums.length == 0)
        {
            return Integer.MAX_VALUE;
        }

        int ans = nums[0];

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] < ans)
            {
                ans = nums[i];

            }
        }
        return ans;
    }
    static int findminindex(int[] nums )
    {
        if(nums.length==0)
        {
            return Integer.MAX_VALUE;
        }
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i]==min(nums))
            {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
