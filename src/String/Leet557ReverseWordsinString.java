package String;

public class Leet557ReverseWordsinString
{
    public static void main(String[] args)
    {
     String s = "Let's Take Leetcode Contest";
        System.out.println(reverseworld(s));
    }
static String reverseworld(String s)
{
    String[] words = s.split(" ");
    StringBuilder sb = new StringBuilder();

    for (String word : words)
    {
        StringBuilder temp = new StringBuilder(word);

        sb.append(temp.reverse()).append(" ");
    }
    return sb.toString().trim();
}
}
