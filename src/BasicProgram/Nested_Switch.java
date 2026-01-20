package BasicProgram;

import java.util.Scanner;

public class Nested_Switch {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int empid = sc.nextInt();
        String depart = sc.next();

        switch (empid)
        {
            case 1:
                System.out.println("Ajinkya Sultane");
                break;

            case 2:
                System.out.println("Jaypal Girase");
                break;

            case 3:
                System.out.println("Emp No three");
                switch (depart)
                {
                    case "IT":
                        System.out.println("Ajinkya is Software engg");
                        break;
                    case "MECH":
                        System.out.println("JP is a Mech Engg");
                        break;
                    default:
                        System.out.println("NO more Engg");
                }
                break;
            default:
                System.out.println("No more Employee");
        }

    }
}
