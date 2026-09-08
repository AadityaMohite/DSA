import java.util.Scanner;
public class Maximum_product_Subarray {
    public static int maximumproduct(int arr[]){

       int prefix = 1;
       int suffix = 1;
       int ans = Integer.MIN_VALUE;

       int n = arr.length;
       
       for(int i = 0; i<arr.length; i++){

       
         if(prefix==0){
            prefix = 1;
           }

            if(suffix==0){
                suffix=1;
            }


           prefix = prefix*arr[i];
           suffix = suffix*arr[n-i-1];


          
         ans = Math.max(ans, Math.max(prefix, suffix));
       }

         return ans;

    }
    public static  void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];


        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }


     int ans =   maximumproduct(arr);

     System.out.print("Maximum Product is : "+ans);

        sc.close();
    }
}
