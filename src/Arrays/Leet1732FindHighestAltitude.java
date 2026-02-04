package Arrays;

public class Leet1732FindHighestAltitude {
    public static void main(String[] args)
    {
        int[] arr = {-5,1,0,5,-7};
        System.out.println(findHigestAltitude(arr));
    }
    static int findHigestAltitude(int[] gains)
    {
        int currentAltitude = 0;
        int maxAltitude = 0;

     //   for(int i = 0; i< gains.length; i++)
        for (int i:gains)
        {
            currentAltitude += i;

            if(currentAltitude > maxAltitude)
            {
                maxAltitude = currentAltitude;
            }
        }
        return maxAltitude;
    }
}
