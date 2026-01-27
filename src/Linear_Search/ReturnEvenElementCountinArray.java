package Linear_Search;

public class ReturnEvenElementCountinArray {

    public static void main(String[] args)
    {
        int[] arr = {12,6,8,434,7896};
        System.out.println(findNumbers(arr));
    }

        static int findNumbers(int[] nums) {

            int count = 0;
            for(int num : nums)
            {
                if(even(num))
                {
                     count++;
                }
            }
            return count;
        }
        static boolean even(int num)
        {
            int countofdigit = countdigit(num);

            //     if(countofdigit % 2 == 0)
            //     return true;

            // return false;
            return countofdigit % 2==0;
        }
        static int countdigit(int nums)
        {
            int count = 0;
            while(nums > 0)
            {
                count++;
                nums /= 10;
            }

            return count;

        }
    }

