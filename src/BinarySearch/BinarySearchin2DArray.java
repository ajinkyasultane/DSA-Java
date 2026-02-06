package BinarySearch;

import java.util.Arrays;

public class BinarySearchin2DArray
{
    public static void main(String[] args)
    {
        int[][] arr = {{10,20,30,40},
                {12,24,36,48},
                {13,26,39,52},
                {14,28,42,56}};

        int target = 39;

        System.out.println(Arrays.toString(searchinmatrix(arr,target)));
    }
    static int[] searchinmatrix(int[][] matrix , int target)
    {
        int row = 0;
        int col = matrix.length -1;

        while (row < matrix.length && col >= 0)
        {
            if (matrix[row][col] == target)
            {
                return new int[]{row,col};
            }
            else if (matrix[row][col] < target)
            {
                row++;
            }
            else
            {
                col--;
            }
        }
        return new int[] {-1,-1};
    }
}
