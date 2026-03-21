package String;

public class Leet686RepeatedStringMatch {
    public static void main(String[] args)
    {
     String  a = "abcd", b = "cdabcdab";

        System.out.println(repeatedString(a,b));
    }
    static int repeatedString(String a , String b)
    {
        StringBuilder sb = new StringBuilder();
        int count = 0 ;

        while (sb.length() < b.length())
        {
            sb.append(a);
            count++;
        }

        if(sb.indexOf(b) != -1) return count;
        sb.append(a);
        count++;

        if (sb.indexOf(b) != -1) return count;

        return -1;
    }
}
