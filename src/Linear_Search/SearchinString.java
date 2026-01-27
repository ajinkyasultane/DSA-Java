package Linear_Search;

public class SearchinString {
    public static void main(String[] args)
    {
    String name = "Ajinkya";
    char ch = 'a';
        System.out.println(search(name,ch));
    }
    static boolean search(String name, char ch)
    {
        if (name.length()==0)
        {
            return false;
        }

//        for (int i = 0; i<name.length(); i++)
//        {
//            if (ch == name.charAt(i))
//            {
//                return true;
//            }
//        }

        for(char target : name.toCharArray())
        {
            if(ch == target)
            {
                return true;
            }
        }
        return false;
    }
}
