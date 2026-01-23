package BasicProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Var_Args {
    public static void main(String args[])
    {
fun(2,65,676,87,97,656,76,55,676,65,47,6,65);
multiple("Ajinkya","Sultane",43,64,54,64,4,6,3);
    }
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(String name , String surname , int ...v)
    {
        System.out.println(name);
        System.out.println(Arrays.toString(v));
    }

}
