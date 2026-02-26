package String;

public class Leet657RobotReturntoOrigin {
    public static void main(String[] args)
    {
        String moves = "UU";
        System.out.println(judgeCircle(moves));
    }
    static boolean judgeCircle(String moves)
    {
        int x = 0;
        int y = 0;

        for(int i = 0 ; i < moves.length(); i++)
        {
            char c = moves.charAt(i);

            if (c == 'U')
            {
                y++;
            }
            else if(c == 'D')
            {
                y--;
            }
            else if(c == 'R')
            {
                x++;
            }
            else if(c == 'L')
            {
                x--;
            }
        }
        return x == 0 && y ==0;
    }
}
