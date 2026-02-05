package Arrays;

import java.util.Arrays;

public class Leet832FliptheImage {

    public static void main(String[] args)
    {
        int[][] arr = {{1,0,0},
                {1,1,0},
                {0,1,0}};

        // System.out.println(Arrays.toString(fliptheimage(arr)));
        int[][] ans = fliptheimage(arr);

        //System.out.println(Arrays.toString(ans));

        for(int[] i : ans)
        {
            System.out.println(Arrays.toString(i));
        }
    }
    static int[][]  fliptheimage(int[][] image)
    {
        int n = image.length;

        for(int i = 0; i < n; i++)
        {
            int left = 0;
            int right = n -1;

            while (left <= right)
            {
                int temp = image[i][left] ^1;
                image[i][left] = image[i][right] ^1;
                image[i][right] = temp;

                left++;
                right--;
            }
        }
        return image;
    }

}
