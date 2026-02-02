package Arrays;

import javax.swing.*;

public class Leet1832CheckPangram
{
    public static void main(String[] args)
    {
        String a = "thequickbrownfoxjumpsoverthelazydog";
        String  b = "helloajinkyasultane";

        System.out.println(checkStringPangram(a));
        System.out.println(checkStringPangram(b));
    }
    static   boolean checkStringPangram(String s)
    {
        boolean[] ans = new boolean[26];
            int count = 0;

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            count++;
            if(ch >= 'a' && ch <= 'z')
            {
                ans[ch - 'a'] = true;
            }
        }
        System.out.println(count);
        for (boolean b : ans)
        {
            if (!b)
            {
                return false;
            }
        }
        return true;
    }
}
