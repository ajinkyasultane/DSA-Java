package String;

public class Leet1678GoalParserInterpretation {
    public static void main(String[] args)
    {
     String str = "G()(al)";
        System.out.println(interpret(str));
    }
    static String interpret(String str)
    {
//        StringBuilder sb = new StringBuilder();
//
//        for(int i = 0; i < str.length(); i++)
//        {
//            if(str.charAt(i) == 'G')
//            {
//                sb.append("G");
//            }
//            else if(str.charAt(i) == '(' && str.charAt(i+1) == ')')
//            {
//                sb.append("o");
//                i++;
//            }
//            else
//            {
//                sb.append("al");
//                i+= 3;
//            }
//        }
//        return sb.toString();

        return  str.replace("()","o").replace("(al)" , "al");
    }
}
