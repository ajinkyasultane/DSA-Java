package String;

public class Leet1309DecrpytString
{
    public static void main(String[] args)
    {
     String s ="10#11#12";
        System.out.println(decrypt(s));
    }
    static String decrypt(String s)
    {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++)
        {
            if (i + 2 < s.length() && s.charAt(i+2) == '#')
            {
                int num = (s.charAt(i) - '0')* 10 + (s.charAt(i+1) - '0');
                sb.append((char)('a' + num - 1));
                i += 2;
            }
            else
            {
                int num = s.charAt(i) - '0';
                sb.append((char)('a' + num - 1));
            }
        }
        return sb.toString();
    }

}
