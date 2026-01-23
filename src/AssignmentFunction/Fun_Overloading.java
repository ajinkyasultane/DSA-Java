package AssignmentFunction;

public class Fun_Overloading {
    public static void main(String args[])
    {
        int ans1 = sum(10,12);
        int ans2 = sum(10, 43,54);
        System.out.println(ans1);
        System.out.println(ans2);
    }
    static int  sum(int no, int no2)
    {
        return no + no2;
    }
    static int sum(int no1, int no2,int no3)
    {
        return no1+no2+no3;
    }

}
