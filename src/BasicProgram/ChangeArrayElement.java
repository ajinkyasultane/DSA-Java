package BasicProgram;

import java.util.Arrays;

public class ChangeArrayElement {
    public static void main(String args[])
    {
        int[] arr = {1,42,323,43,545,64};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums)
    {
        nums[0]= 99;
        nums[2]= 21;
    }

}
