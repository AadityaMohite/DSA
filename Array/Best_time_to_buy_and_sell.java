import java.util.Scanner;
public class Best_time_to_buy_and_sell {

    public static int Stocks(int[] arr){

           int min = arr[0];
           int profit = 0;

           for(int i = 1; i<arr.length; i++){
             
                 int cost = arr[i] - min;
                 profit = Math.max(profit, cost);
                 min = Math.min(min, arr[i]);
           }




        return profit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements :");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

     int result =     Stocks(arr);

     System.out.println("Maximum Profit "+result);

        
    }
}
