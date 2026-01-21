package Conditional_Assignment;

public class CountEvenDays {
    public static void main(String args[])
    {
        int days = 31;
        int count = 0;
        int i = 1;
        while (i <= days) {
            if (i % 2 == 0) {
                count = count+1;
                System.out.println("Kunal is going with Rahul"+ i);
            }
            i++;
        }
        System.out.println("Kunal is going with rahul "+ count +" days in August Month");
    }
}
