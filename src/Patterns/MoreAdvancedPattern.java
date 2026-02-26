package Patterns;

public class MoreAdvancedPattern {

    public static void main(String[] args)
    {
     pattern31(5);
    }
    static void pattern17(int n)
    {
        for(int row = 1; row <= 2*n; row++)
        {
            int totalnoofcolsinrow = row > n ?2*n - row : row;

            for (int space = 1 ; space <= n - totalnoofcolsinrow ; space++) {
                System.out.print("  ");
            }
            for (int cols = totalnoofcolsinrow ; cols >=1 ; cols--)
            {
                System.out.print(cols +" ");
            }
            for (int cols = 2; cols <= totalnoofcolsinrow ; cols++)
            {
                System.out.print(cols + " ");
            }
            System.out.println();
            }
    }
    static void pattern31(int n)
    {   int original = n;
        n = 2 *n ;
        for(int row = 0; row <= n; row++)
        {
            for(int cols = 0; cols <= n; cols++)
            {
                int elementindex = original - Math.min(Math.min(row,cols),Math.min(n - row, n-cols));
                System.out.print(elementindex+ " ");
            }
            System.out.println();
        }
    }
}
