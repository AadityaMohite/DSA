import java.util.Scanner;
public class Maximum_Consecutive_One{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

          
        int n = sc.nextInt();


        int[] arr = new int[n];

        for(int i = 0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
      
         int count = 0;
         int max = 0;
        for(int i = 0; i<arr.length; i++){
           
            if(arr[i]==1){
                count++;
            }else{
                count = 0;
            }

         max = Math.max(max,count);

        }

        System.out.println("Maximum Consecutive Ones : "+max);


        sc.close();
    }
}