import java.util.Scanner;
import java.util.HashMap;
public class Two_Sum {

     //Brute force approach 
    // public static int[] Sum(int[] arr, int target) {

    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[i] + arr[j] == target) {
    //                 return new int[] { i, j };
    //             }
    //         }
    //     }
    //     return new int[] { -1, -1 };
    // }


    //Optimal approach
    public static String Sum2(int[]arr,int target){

      HashMap<Integer,Integer> map = new HashMap<>();

      for(int i = 0; i<arr.length; i++){
            int more = target - arr[i];

            if(map.containsKey(more)){

                System.out.println(map.get(more)+" "+i);
                return "Yes";
            }

             map.put(arr[i],i);
              
      }

      return "No";


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

      String str  = Sum2(arr, target);

         System.out.println(str);
         

        sc.close();
    }
}
