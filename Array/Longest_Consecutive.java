import java.util.Arrays;
import java.util.Scanner;
public class Longest_Consecutive {
    public static int Longest(int[] arr){

         
      int   longest = 1;
      int lastsmall = Integer.MIN_VALUE;
     int count = 0;
      for(int  i = 0; i<arr.length; i++){
        if(arr[i]-1 == lastsmall){
            count ++;
         lastsmall = arr[i];
        }else if(arr[i]!=lastsmall){
          count = 1;
          lastsmall = arr[i];
        }

      longest = Math.max(longest,count);
      }



        return longest;
    }
  
      
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

          int n = sc.nextInt();

          int arr[] = new int[n];

          for(int i = 0; i<arr.length; i++){
              arr[i] = sc.nextInt();
          }

              Arrays.sort(arr);

              System.out.print(arr);
                
         int result = Longest(arr);

         System.out.println("Longest Sequence : "+result);
    }
}
