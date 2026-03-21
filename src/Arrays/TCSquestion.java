package Arrays;

import java.util.Scanner;

public class TCSquestion {
    public static void main(String[] args)
    {
      //  int hours = 4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value in a Hours");
        int hours = sc.nextInt();

        System.out.println(charParking(hours));
    }
    static int charParking(int hours)
    {
        if(hours < 0)
        {
            System.out.println("Enter a Positive Hours value");
        }
        else if (hours != 0 && hours <= 2)
        {
            return hours * 100;
        }
        else if(hours != 0 && hours >= 3 && hours <= 5)
        {
            hours -= 2;
          int amout = 200 + (hours * 50);
          return amout;
        }
        else if(hours != 0 && hours >= 5)
        {
            hours -= 5;
            return 350 + (hours * 20);
        }
        return -1;
    }
}
