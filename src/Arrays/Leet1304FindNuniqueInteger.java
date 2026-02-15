package Arrays;

import java.util.Arrays;

public class Leet1304FindNuniqueInteger {
    public static void main(String[] args)
    {
        int n = 5;
        System.out.println(Arrays.toString(unique(n)));
    }

    static int[] unique(int n) {
        int[] arr = new int[n];
        int index = 0;

        if (n % 2 == 1) {
            arr[index++] = 0;
        }

        for (int i = 1; index < n; i++)
        {
            arr[index++] = i;
            arr[index++] = -i;
        }
        return arr;
    }

}
