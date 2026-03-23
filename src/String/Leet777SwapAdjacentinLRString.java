package String;

public class Leet777SwapAdjacentinLRString {

    public static void main(String[] args)
    {
        String start = "RXXLRXRXL", result = "XRLXXRRLX";

        System.out.println(canTransform(start,result));
    }
        static  boolean canTransform(String start, String result) {
            int n = start.length();
            int i = 0, j = 0;

            while (i < n || j < n) {

                // skip X in start
                while (i < n && start.charAt(i) == 'X') i++;

                // skip X in result
                while (j < n && result.charAt(j) == 'X') j++;

                // both reached end
                if (i == n && j == n) return true;

                // only one reached end
                if (i == n || j == n) return false;

                // mismatch
                if (start.charAt(i) != result.charAt(j)) return false;

                // check rules
                if (start.charAt(i) == 'L' && i < j) return false;
                if (start.charAt(i) == 'R' && i > j) return false;

                i++;
                j++;
            }

            return true;
        }
    }
