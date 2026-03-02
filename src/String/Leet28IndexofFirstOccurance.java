package String;

public class Leet28IndexofFirstOccurance {
    public static void main(String[] args)
    {
       String  haystack = "sadbutsad", needle = "sad" ;
        System.out.println(strstr(haystack,needle));
    }
    static int strstr(String haystack, String needle)
    {
        for(int i = 0; i<= haystack.length()-needle.length();i++)
        {
            if (haystack.substring(i,i+needle.length()).equals(needle))
            {
                return i;
            }
        }
        return -1;
    }

}
