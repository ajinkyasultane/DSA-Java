package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Leet1380FindLuckyNo {
    public static void main(String[] args) {
        int[][] arr = {{3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}};

        System.out.println(Luckyno(arr));
    }

    static List<Integer> Luckyno(int[][] matrix) {

       // ArrayList result = new ArrayList<>();

        ArrayList<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            int minval = matrix[i][0];
            int colindex = 0;

            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < minval) {
                    minval = matrix[i][j];
                    colindex = j;
                }
            }

            boolean isLucky = true;

            for (int k = 0; k < m; k++) {
                if (matrix[k][colindex] > minval) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) {
                result.add(minval);
            }


        }

return result;
    }
}
