package String;

public class Leet14LongestCommonPrefix
{
    public static void main(String[] args)
    {
 String[] s = {"Flower", "Flowra","fly","Flight"};
 String ans = prefix(s);
        System.out.println(ans);
        // System.out.println(prefix(s));
    }
    static String prefix(String[] strs)
    {
        if(strs.length == 0) return "";

        for(int i = 0; i < strs.length; i++)
            strs[i] = strs[i].toLowerCase();

        String first = strs[0];

        for(int i = 0; i < first.length(); i++) {

            char c = first.charAt(i);

            for(int j = 1; j < strs.length; j++) {

                if(i >= strs[j].length() || strs[j].charAt(i) != c)
                    return first.substring(0, i);
            }
        }


        return first;
    }
}
