package Arrays;

import java.util.*;
import java.util.ArrayList;


public class Leetcode989AddtoArrayformofInteger {
    public static void main(String[] args)
    {
        int[] arr = {1,2,0,0};
        int k = 786878000;

        System.out.println(addToArrayForm(arr,k));
    }
    static List<Integer> addToArrayForm(int[] arr , int k)
    {
        ArrayList<Integer> resultlist = new ArrayList<>();
        int sum = 0;

        for(int i = arr.length -1; i >= 0; i--)
        {
            sum = arr[i] + k;
            int last_digit = sum % 10;
            resultlist.add(last_digit);

            k = sum / 10;
        }

        while (k > 0)
        {
            int result = k % 10;
            resultlist.add(result);

            k /= 10;
        }

        Collections.reverse(resultlist);

        return resultlist;

    }
}
