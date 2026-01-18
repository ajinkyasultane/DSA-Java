package Assigment.FirstJavaLecture;

public class Occurance {
    public static void main(String args[])
    {
        int n = 13839303;
        int count = 0;
        int rem = 0;

        while (n > 0)
        {
            rem = n % 10;
            if(rem == 3)
            {
               count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
