package Patterns;

public class Pattern1 {
    public static void main(String[] args)
    {
       // patter1(4);
        pattern6(5);
        System.out.println();
       // pattern2(5);

    }
    static void pattern2(int n)
    {
        for(int i = 1 ; i <= n; i++)
        {
            for (int j = 1; j <= i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void patter1(int n)
    {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n)
    {
//        for (int i = n; i>= 1; i--)
//        {
//            for (int j = i; j>= 1; j--)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for (int row = 1; row <= n ; row++)
        {
            for (int cols = 1; cols <= n + 1 - row ; cols++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n)
    {
        for(int rows = 1; rows <= n; rows++)
        {
            for (int cols = 1 ; cols <= rows; cols++)
            {
                System.out.print(cols+ " ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalrowcols = row > n ? 2 * n - row : row;

            for (int col = 1; col <= totalrowcols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
