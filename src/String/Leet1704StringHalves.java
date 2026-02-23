package String;

public class Leet1704StringHalves
{
    public static void main(String[] args) {
        String s = "textbook";
        String w = "book";
        System.out.println(check(s));
        System.out.println(check(w));
    }

    static boolean check(String s)
    {
        int mid = s.length() / 2;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (isVowel(ch)) {
                if (i < mid) {
                    count1++;
                } else {
                    count2++;
                }
            }
        }

        return count1 == count2;
    }

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
