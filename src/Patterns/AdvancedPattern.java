package Patterns;

public class AdvancedPattern {
    public static void main(String[] args)
    {
       // diamond(5);
        pattern30(5);
    }
    static void diamond(int n)
    {
        for (int row  = 1; row <= 2 * n-1; row++)
        {
            int totalcolsinrow = row > n ? 2 * n - row :row;

            int space = n - totalcolsinrow;
            for (int s = 1 ; s <= space; s++)
            {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalcolsinrow;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n)
    {
        for (int row = 1; row <= n ; row++)
        {
            for (int space = 0 ; space < n - row ; space++)
            {
                System.out.print("  ");
            }
            for (int cols = row ; cols >= 1 ; cols--)
            {
                System.out.print(cols + " ");
            }

            for (int cols = 2 ; cols <= row; cols++)
            {
                System.out.print(cols+ " ");
            }
            System.out.println();

        }
    }

}
