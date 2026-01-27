package Linear_Search;

public class FindMaxin2DArray {
    public static void main(String[] args)
    {
     int[][] arr = {{3,2,1},
             {7,8,966,434},
             {777,43543,435}};
        System.out.println(max(arr));
    }
    static int max(int[][] nums)
    {
        int max = nums[0][0];
//        for(int row = 0 ; row < nums.length; row++)
//        {
//            for(int col = 0; col < nums[row].length; col++)
//            {
//                if(nums[row][col] > max)
//                {
//                    max = nums[row][col];
//                }
//            }
//        }

        for(int[] arr : nums)
        {
            for (int element : arr)
            {
                if (element > max)
                {
                    max = element;
                }
            }
        }
        return max;
    }

}
