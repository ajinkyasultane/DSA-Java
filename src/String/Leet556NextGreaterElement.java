package String;

public class Leet556NextGreaterElement {
    public static void main(String[] args)
    {
        int n = 12;
        System.out.println(nextGreaterElement(n));
    }
    static int nextGreaterElement(int n) {
        char[] arr = String.valueOf(n).toCharArray();

        int i = arr.length - 2;

        // Step 1: find first decreasing digit
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i < 0) return -1;

        // Step 2: find just greater digit
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        // Step 3: swap
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // Step 4: reverse right side
        reverse(arr, i + 1, arr.length - 1);

        long result = Long.parseLong(new String(arr));

        return (result > Integer.MAX_VALUE) ? -1 : (int) result;
    }

    static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

