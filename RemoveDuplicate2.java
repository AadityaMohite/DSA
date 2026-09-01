import java.util.Scanner;
public class RemoveDuplicate2{
    public static int Rmoveduplicate(int arr[]){

        int i =0;
        for(int j = 0; j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int[] arr = new int[n];

        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

      int length =  Rmoveduplicate(arr);

        for(int i = 0; i<length;i++){
        System.out.print(arr[i]+" ");
        }


          sc.close();
    }
}