package Arrays;

public class Leet1572sumofDiagonalinMatrix
{
    public static void main(String[] args)
    {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(diagonalsum(matrix));
        System.out.println(diagonalsumlogic2(matrix));
    }
    static int diagonalsum(int[][] mat)
    {
        int n  = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum += mat[i][i];
            sum += mat[i][n-1-i];
        }

        if (n % 2 == 1)
        {
            int center = mat[n/2][n/2];
            sum -= center;
        }
        return sum;
    }

    static int diagonalsumlogic2(int [][] mat)
    {
        int n = mat.length;
        System.out.println(n);
        int sum = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(i== j || i+j == n -1)
                {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}

