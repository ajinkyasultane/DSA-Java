package Arrays;

public class Leet1854MaximumPopulationYear {
    public static void main(String[] args)
    {
        int[][] arr = {{1993,1999},{2000,2010},{1970,2020}};
        int ans = maximumPopulation(arr);
        System.out.println(ans);
    }
    static int maximumPopulation(int[][] logs)
    {
        int[] years = new int[101];

        for(int[] log : logs)
        {
            int birth = log[0] - 1950;
            int death = log[1] - 1950;

            years[birth] += 1;
            years[death] -= 1;
        }
        int maxpopulation = 0;
        int currentpopulation =0;
        int resultyear = 1950;

        for(int i =0; i < 101; i++)
        {
            currentpopulation += years[i];
            if (currentpopulation > maxpopulation)
            {
                maxpopulation = currentpopulation;
                resultyear = 1950 +i;
            }
        }
        return resultyear;
    }
}
