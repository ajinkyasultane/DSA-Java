package Arrays;
import java.util.*;
import java.lang.*;

public class ArrayList {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>(3);
        list.add(21);
        list.add(32);
        list.add(33);
        list.add(324);
        list.add(325);
        list.add(326);
        list.add(327);

        System.out.println(list);
        list.set(2,555);
        list.remove(4);
        System.out.println(list);
        System.out.println(list.get(4));

    java.util.ArrayList<String> student = new java.util.ArrayList<String>(3);

        System.out.println("Enter Element in Arraylist");
    for (int i = 0 ; i <5; i++)
    {
        student.add(sc.next());
    }

    for (int i = 0 ; i<5; i++)
    {
        System.out.print(student.get(i)+ " ");
    }
    sc.close();
    }
}
