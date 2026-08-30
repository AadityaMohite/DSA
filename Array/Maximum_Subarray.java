import java.util.Scanner;
public class Maximum_Subarray {

    public static int maximum_sub(int[] arr){

         int max = Integer.MIN_VALUE;

         int sum = 0;

         for(int i = 0; i<arr.length; i++){
           sum = sum + arr[i];

           if(sum>max){
            max = sum;
           }

           if(sum<0){
            sum = 0;
           }
         }


        
      return max;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

      int[]  arr = new int[n];


      for(int i = 0; i<arr.length;i++){
        arr[i] = sc.nextInt();
      }

      int result =  maximum_sub(arr);

      System.out.println(result);

    }
}
