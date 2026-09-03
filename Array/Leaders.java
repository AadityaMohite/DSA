import java.util.ArrayList;
import java.util.Scanner;
  
public class Leaders {
    public static ArrayList<Integer> leaders(int[] arr){
      int n = arr.length;

      ArrayList<Integer> list = new ArrayList<>();
      int max = Integer.MIN_VALUE;
      
      for(int i = n-1;i>=0; i--){
          if(arr[i]>max){
             list.add(arr[i]);
          }

          max = Math.max(max, arr[i]);
      }

      return list;
      
  }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

          int[] arr = new int[n];

          for(int i = 0; i<arr.length; i++){
             arr[i] = sc.nextInt();
          }

        ArrayList<Integer> list =  leaders(arr);
        for(int x: list){
            System.out.print(x+" ");
        }
     } 
}
