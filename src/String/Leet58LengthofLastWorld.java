package String;

public class Leet58LengthofLastWorld {
    public static void main(String[] args)
    {
        String a = "Sultane Ajinkya";
        String b = "Mr Invincible";
        System.out.println(approch1(a));
        System.out.println(approach2(b));
    }
    static int approch1(String s)
    {
        int  i = s.length()-1;
        int count = 0;

        while (i >= 0 && s.charAt(i) == ' ')
        {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ')
        {
            count++;
            i--;
        }
        return count;
    }

    static int approach2(String s)
    {
        String[] arr = s.trim().split(" ");
        int ans = arr[arr.length -1].length();
        return ans;
    }


}
