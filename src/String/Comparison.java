package String;

public class Comparison {
    public static void main(String[] args)
    {
        String a = "ajinkya";
        String b = "ajinkya";

        System.out.println(a == b);

        String name1 = new String("Ajinkya");
        String name2 = new String("Ajinkya");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

    }

}
