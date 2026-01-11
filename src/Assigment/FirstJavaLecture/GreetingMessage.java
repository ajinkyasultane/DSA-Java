package Assigment.FirstJavaLecture;

import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class GreetingMessage {
    public static void main(String args[])
    {
        System.out.println("Enter how many times you want to check");
        Scanner sc1 = new Scanner(System.in);
        int times = sc1.nextInt();
        int i = 0;
        while (i != times) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name ");
            String name = sc.nextLine().toLowerCase();

            if (name.equals("ajinkya")) {
                System.out.println("Hey Invinicible ");
            } else if (name.equals("sham")) {
                System.out.println("Hello BodyBuilders");
            } else if (name.equals("nivrutti")) {
                System.out.println("Hello Good Morning");
            } else if (name.equals("tejas")) {
                System.out.println("Hey Happy Birthday");
            } else {
                System.out.println("Hello Guys , Have a Nice Day");
            }
            i++;
        }
    }

}
