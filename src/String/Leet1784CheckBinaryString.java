package String;

public class Leet1784CheckBinaryString {
    public static void main(String[] args)
    {
    String s = "11000";
        System.out.println(checkstring(s));
    }
    static boolean checkstring(String s)
    {
        int count = 0;

        for(int i = 0; i< s.length();i++)
        {
            if (s.charAt(i)=='1' && (i == 0 || s.charAt(i -1) == '0'))
            {
                count++;
            }
        }
        return count <= 1;
    }
}
