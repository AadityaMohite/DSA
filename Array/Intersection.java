import java.util.Scanner;
import java.util.ArrayList;

public class Intersection {


    
// Optimal Approach
    public static ArrayList<Integer> Intersection(int[] arr, int[] arr1) {

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        int n1 = arr.length;
        int n2 = arr1.length;

        while (i < n1 && j < n2) {

            if (arr[i] < arr1[j]) {
                i++;
            } else if (arr[i] > arr1[j]) {
                j++;
            } else {

                list.add(arr[i]);
                i++;
                j++;

            }

        }

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        int n2 = sc.nextInt();

        int[] arr = new int[n1];

        int[] arr1 = new int[n2];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        ArrayList<Integer> list = Intersection(arr, arr1);

        for (int num : list) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
