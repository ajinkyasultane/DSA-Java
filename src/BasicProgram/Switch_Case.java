package BasicProgram;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter how many time you want ot check");
        int n = sc.nextInt();
        while (i < n)
        {
//            System.out.println("Enter a Day Number");
//            int day = sc.nextInt();
//
//            switch (day)
//            {
//                case 1 -> System.out.println("Monday");
//                case 2-> System.out.println("Tuesday");
//                case 3 -> System.out.println("Wednesday");
//                case 4 -> System.out.println("Thursday");
//                case 5 -> System.out.println("Friday");
//                case 6 -> System.out.println("Saturday");
//                case 7 -> System.out.println("Sunday");
//                default -> System.out.println("Enter a valid days");
//            }

            System.out.println("Enter a Fruit Name");
            String fruit = sc.nextLine().toLowerCase();

            switch (fruit)
            {
                case "mango":
                    System.out.println("King of Fruits");
                    break;
                case "pineapple":
                    System.out.println("Very Tasty and Crispy fruits");
                    break;
                default:
                    System.out.println("you Enter another fruits");
                    break;
            }
           i++;
        }
    }
}
