package BinarySearch;

public class OrderArgonstic {
    public static void main(String[] args)
    {
        int[] arrasc = {1,2,4,6,8,12,14,16,111};
        int[] arrdec = {111,23,22,21,11,9,7,5,3,2};
        int tarasc = 1;
        int tardec = 111;

        System.out.println(orderArgonstic(arrasc,tarasc));
        System.out.println(orderArgonstic(arrdec,tardec));
    }
    static int orderArgonstic(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length-1;

        if(arr.length == 0)
        {
            return -1;
        }

        boolean isAsc = arr[0] < arr[end];

//        if (arr[0] < arr[end])
//        {
//            isAsc = true;
//        }

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target ==arr[mid])
                {
                    return mid;
                }
                if (isAsc)
                {
                if(target < arr[mid])
                {
                    end = mid -1;
                }
                else
                {
                    start = mid +1;
                }
                {

                }

            }
                else
                {
                    if (target > arr[mid])
                    {
                        end = mid -1;
                    }
                    else
                    {
                        start = mid +1;
                    }
                }
        }
            return -1;
    }
}
