import java.util.Scanner;
import java.util.HashMap;

public class LongestSubarray {
    // Brute Force approch
    // public static int Longest(int[] arr, int k) {

    // int maxlength = 0;
    // for (int i = 0; i < arr.length; i++) {

    // int sum = 0;

    // for (int j = i; j < arr.length; j++) {
    // sum += arr[j];

    // if (sum == k) {
    // int length = j - i + 1;
    // maxlength = Math.max(maxlength, length);
    // }

    // }

    // }
    // return maxlength;
    // }




    
    // Better approach

    public static int Longest2(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int length = 0;
        int maxlength = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == k) {
                length = i + 1;
            }

            if (map.containsKey(sum - k)) {
                length = i - map.get(sum - k);
                maxlength = Math.max(maxlength, length);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

        }

        return maxlength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

        }

        int k = sc.nextInt();

        int result = Longest2(arr, k);

        System.out.println("Longest Sub array is : " + result);

        sc.close();
    }
}
