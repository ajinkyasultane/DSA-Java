package String;

public class Leet1668MaximumRepatingSubstring {
    public static void main(String[] args)
    {
        String squence = "ababc";
        String word = "ab";
        System.out.println(maxrepeating(squence,word));
    }
    static int maxrepeating(String sequence , String word)
    {
        int k =0;
        String temp = word;

        while(sequence.contains(temp))
        {
            k++;
            temp+= word;
        }
        return k;
    }

}
