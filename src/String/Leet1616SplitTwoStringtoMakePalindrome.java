package String;

public class Leet1616SplitTwoStringtoMakePalindrome {

    public static void main(String[] args)
    {
        String a = "ulacfd", b = "jizalu";
        System.out.println(checkPalindromeFormation(a,b));
    }

        static boolean checkPalindromeFormation(String a, String b) {
            return check(a , b) || check(b,a);
        }

        static boolean check(String a , String b)
        {
            int i = 0;
            int j = a.length()-1;

            while(i < j && a.charAt(i) == b.charAt(j) )
            {
                i++;
                j--;
            }
            return ispalindrome(a,i,j)||ispalindrome(b,i,j);
        }

        static boolean ispalindrome(String s , int i , int j)
        {
            while(i < j)
            {
                if(s.charAt(i) != s.charAt(j))
                {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }


