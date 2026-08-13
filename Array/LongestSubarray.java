import java.util.Scanner;

public class LongestSubarray {

    public static int Longest(int[] arr, int k) {

        int maxlength = 0;
        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == k) {
                    int length = j - i + 1;
                    maxlength = Math.max(maxlength, length);
                }

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

        int result = Longest(arr, k);

        System.out.println("Longest Sub array is : " + result);

        sc.close();
    }
}
