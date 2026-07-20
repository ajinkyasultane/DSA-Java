package SimpleStarting;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args)
    {
        System.out.println("For Stopa a Program Enter 0");
        boolean value = true;
        while (value) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a emp no");
            int a = sc.nextInt();
            System.out.println("Enter a Department");
            String d = sc.next();

            switch (a) {
                case 0 -> {
                    value = false;
                    System.out.println("Program Terminated");
                }
              //  case 0 -> value = false;
                case 1 -> System.out.println("Ajinkya");
                case 2 -> System.out.println("Tejas");
                case 3 -> {
                    System.out.println("Yogesh");
                    switch (d) {
                        case "IT" -> System.out.println("Software Engg");
                        case "Civil" -> System.out.println("Construcstion engg");
                        default -> System.out.println("Enter a valid Department");
                    }

                }
                default -> System.out.println("Enter a valid emp id");
            }
        }
    }
}
