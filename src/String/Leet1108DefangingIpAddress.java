package String;

public class Leet1108DefangingIpAddress {
    public static void main(String[] args)
    {
        String str = "1.1.1.1";
        System.out.println(defanging(str));
        System.out.println(repl(str));

    }
    static String defanging(String str)
    {
        str = str.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == '.')
            {
                sb.append('[');
                sb.append('.');
                sb.append(']');
            }
            else
            {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    static String repl(String str)
    {
        return str.replace(".","[.]");

    }


}
