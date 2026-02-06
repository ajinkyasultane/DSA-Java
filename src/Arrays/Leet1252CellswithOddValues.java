package Arrays;

import java.util.Arrays;

public class Leet1252CellswithOddValues
{
    public static void main(String[] args)
    {
        int[][] arr = {{0,1},{1,1}};
        int m = 2;
        int n = 3;

        int ans = oddcells(m,n,arr);

       // System.out.println(Arrays.toString(ans));
        System.out.println(ans);

    }
    static int oddcells(int m, int n, int[][] indices)
    {
        int[] row = new int[m];
        int[] col = new int[n];

        for (int[] idx : indices)
        {
            row[idx[0]]++;
            col[idx[1]]++;
        }

        int oddrows = 0;

        for (int r : row)
        {
            if (r % 2 ==1)
            {
                oddrows++;
            }
        }

        int oddcols = 0;

        for (int c : col)
        {
            if (c % 2 == 1)
            {
                oddcols++;
            }
        }

        return oddrows * (n - oddcols) + (m - oddrows) * oddcols;
    }
}
