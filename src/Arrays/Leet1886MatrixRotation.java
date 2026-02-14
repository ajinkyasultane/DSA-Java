package Arrays;

public class Leet1886MatrixRotation {
    public static void main(String[] args)
    {
        int[][] mat = {{0,1},{1,0}};
        int[][] target = {{1,0},{0,1}};

        System.out.println(findRotate(mat,target));

    }
    static boolean findRotate(int[][] mat , int[][] target)
    {
        for(int i = 0; i < mat.length; i++)
        {
            if(isEqual(mat, target))
            {
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }
    static int[][] rotate(int[][] m)
    {
        int n = m.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                res[j][n - 1- i] = m[i][j];
            }
        }
        return res;
    }
    static boolean isEqual(int[][] a , int[][] b)
    {
        int n = a.length;
        for(int i = 0 ; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(a[i][j] != b[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
