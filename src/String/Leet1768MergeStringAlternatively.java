package String;

public class Leet1768MergeStringAlternatively {
    public static void main(String[] args)
    {
        String a = "Ajinkya";
        String b = "Sultane";

        System.out.println(merge(a,b));
    }
    static String merge(String word1, String word2)
    {
        StringBuilder sb =new StringBuilder();
        int i = 0;

        while (i < word1.length() || i < word2.length())
        {
            if(i < word1.length())
            {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length())
            {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }

}
