package Recursion;

public class FiboFormula {
    public static void main(String[] args)
    {
        for (int i = 0; i < 15; i++)
        {
            System.out.println(fiboformula(i));
        }
    }
    static int fiboformula(int n)
    {
        double phi = (1 + Math.sqrt(5)) / 2;
        double psi = (1 - Math.sqrt(5)) /2;

        return (int) ((Math.pow(phi,n) - Math.pow(psi,n)) / Math.sqrt(5));

      //  return (int) (Math.pow((1+Math.sqrt(5)) / 2,n)/Math.sqrt(5));
    }

}
