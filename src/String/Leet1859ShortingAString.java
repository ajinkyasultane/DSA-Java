package String;

public class Leet1859ShortingAString {

    public static void main(String[] args)
    {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sort(s));

    }
    static String sort(String s)
    {
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (String word : words)
        {
            int len = word.length();
            int position = word.charAt(len - 1) - '0';

            result[position - 1] = word.substring(0,len -1);
        }
        return String.join(" ",result);
    }
}
