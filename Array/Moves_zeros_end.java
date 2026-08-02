import java.util.Scanner;
public class Moves_zeros_end {
  //optimal approach
  // time complexity = O(n)
  // spce complexity = O(1);
    public static void Move_zero_end(int[] arr){

         int j = -1;
        for(int i = 0; i<arr.length; i++){
         
            if(arr[i]==0){
                j=i;
                break;
            }
        }
     
          if(j==-1){
            return;
          }

          for(int i = j+1; i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
          }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];


        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
      
        Move_zero_end(arr);

      for(int num : arr){
        System.out.print(num+" ");
      }


        sc.close();
    }
}
