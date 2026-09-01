import java.util.Scanner;
public class SecondLargestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();

        int[] arr  = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int secmax = 0;
        for(int num : arr){
            if(num>max){
                secmax = max;
                max = num;
            }else if(num>secmax && num!=max){
                 secmax = num;
            }
        }
    

        System.out.println("Second maximum number : "+secmax);

      sc.close();
    }
}
