package String;

public class Leet610ValidPalindrome {
    public static void main(String[] args)
    {
        String s = "aba";
        String f = "abca";

        System.out.println(check(f));
    }
    static boolean check(String s)
    {
        int left = 0;
        int right = s.length() -1;

        while (left < right)
        {
            if (s.charAt(left) != s.charAt(right))
            {
                return ispalindrome(s,left+1,right) || ispalindrome(s,left, right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    static boolean ispalindrome(String s , int left , int right)
    {
        while (left < right)
        {
            if (s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
