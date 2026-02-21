package String;

public class Leet1662Check2StringEquivalent {
    public static void  main(String[] args)
    {
     String[]  word1 = {"ab", "c"}, word2 = {"a", "bc"}  ;

     boolean ans = equalent(word1,word2);
        System.out.println(ans);
    }
    static boolean equalent(String[] word1 , String[] word2)
    {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String w : word1)
        {
            sb1.append(w);
        }

        for (String w1 : word2)
        {
            sb2.append(w1);
        }
        return sb1.toString().equals(sb2.toString());
    }

}
