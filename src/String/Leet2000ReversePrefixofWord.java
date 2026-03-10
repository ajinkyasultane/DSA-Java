package String;

public class Leet2000ReversePrefixofWord {
    public static void main(String[] args)
    {
String a = "abcdefd";
String ch = "d";
        System.out.println(reverseprefix(a,ch));
    }
    static String reverseprefix(String word , String ch)
    {
        int ind = word.indexOf(ch);

        if (ind == -1)
        {
            return word;
        }
        int start = 0;
        int end = ind;

        char[] arr = word.toCharArray();

        while (start < end)
        {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }
}
