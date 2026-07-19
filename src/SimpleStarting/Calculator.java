package SimpleStarting;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);



        while (true)
        {
            System.out.println("Enter a operator");
            char ch = sc.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch =='/' || ch =='%')
            {
                if (ch == '+')
                {
                    System.out.println("enter two no");
                    Scanner in = new Scanner(System.in);
                    float a = in.nextFloat();
                    float b = in.nextFloat();
                    System.out.println(a+b);
                }
                if (ch == '-')
                {
                    System.out.println("enter two no");
                    Scanner in = new Scanner(System.in);
                    float a = in.nextFloat();
                    float b = in.nextFloat();
                    System.out.println(a-b);
                }
                if (ch == '*')
                {
                    System.out.println("enter two no");
                    Scanner in = new Scanner(System.in);
                    float a = in.nextFloat();
                    float b = in.nextFloat();
                    System.out.println(a*b);
                }
                if (ch == '/')
                {
                    System.out.println("enter two no");
                    Scanner in = new Scanner(System.in);
                    float a = in.nextFloat();
                    float b = in.nextFloat();
                    if (b!= 0) {
                        System.out.println(a / b);
                    }
                    else
                    {
                        System.out.println("second no cannot zero");
                    }
                }
                if (ch == '%')
                {
                    System.out.println("enter two no");
                    Scanner in = new Scanner(System.in);
                    float a = in.nextFloat();
                    float b = in.nextFloat();
                    if (b!= 0)
                    {
                        System.out.println(a%b);

                    }
                    else
                    {
                        System.out.println("B value cannot zero");
                    }
                }
            }
            else if(ch == 'x' || ch == 'X')
            {
                break;
            }
            else
            {
                System.out.println("Enter valid operator");
            }
        }
    }
}

