import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Three_Sum {
    public static ArrayList<ArrayList<Integer>>  Sum(int[] arr) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Arrays.sort(arr);



        for (int i = 0; i < arr.length - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {

                int ans = arr[i] + arr[left] + arr[right];

                if (ans == 0) {
                    list.add(new ArrayList<>(Arrays.asList(arr[i], arr[left], arr[right])));

                    while (left < right && arr[left] == arr[left + 1]) {
                        left++;
                    }

                    while (left < right && arr[right] == arr[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                }else if(ans<0){
                     left++;
                }else{
                    right--;
                }

            }
        }
        return list;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

      ArrayList<ArrayList<Integer>>  Result =  Sum(arr);

      for(ArrayList<Integer> x : Result){
          System.out.println("Result of 3 Sum "+ x);
      }

        sc.close();
    }
}