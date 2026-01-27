package Linear_Search;

import java.util.Arrays;

public class SearchinMultiDimensionalArray {
    public static void main(String[] args)
    {
        int[][] arr = {{2,3,4},
                {5,6,7},
                {8,9,10,11},
                {12,13,14,15,16,288}};
        int target = 288;
        System.out.println(Arrays.toString(searchmulArray(arr,target)));
    }
    static int[] searchmulArray(int[][] nums , int target)
    {
        for (int rows = 0 ; rows < nums.length; rows++)
        {
            for(int col = 0; col < nums[rows].length; col++)
            {
                if (nums[rows][col]==target)
                {
                    return new int[]{rows,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
