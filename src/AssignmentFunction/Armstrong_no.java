package AssignmentFunction;

import java.util.Scanner;

public class Armstrong_no {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no for Check this is Armstrong or not");
        int no = sc.nextInt();

        boolean ans = Armstrong(no);
        System.out.println(ans);

        for (int i = 100 ; i < 10000; i++)
        {
            if (Armstrong(i))
            {
                System.out.print(i + " ");
            }
        }

    }
    static boolean Armstrong(int no)
    {
        int original = no;
        int sum = 0;
        int count = 0;
        int power ;

        while (no > 0) {
            count++;
            no /= 10;
        }
        no = original;
        int rem = 0;
        while (no > 0)
        {
             rem = no % 10;
            power = 1;

             for (int i = 1; i<=count; i++)
             {
                 power = power * rem;
             }
             sum += power;
             no /=10;
        }

        return sum == original;

        }

}
