package String;

public class Leet1871JumpGameVII {
public static void main(String[] args)
{
    String a = "011010";
            int  minjump = 2 , maxjump = 3;

    System.out.println(canReach(a,minjump,maxjump));
}
    static boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        boolean[] visited = new boolean[n];
        visited[0] = true;

        int far = 0;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) continue;

            int start = Math.max(i + minJump, far);
            int end = Math.min(i + maxJump, n - 1);

            for (int j = start; j <= end; j++) {
                if (s.charAt(j) == '0') {
                    visited[j] = true;
                }
            }

            far = end + 1;

            if (visited[n - 1]) return true;
        }

        return visited[n - 1];
    }
}