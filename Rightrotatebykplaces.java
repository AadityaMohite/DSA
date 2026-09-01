import java.util.Scanner;
public class Rightrotatebykplaces {
    // //Brute force Approach
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();
    //     int[] arr = new int[n];

    //     int d = sc.nextInt();
         
    //     for(int i = 0; i<arr.length; i++){
    //         arr[i] = sc.nextInt();
    //     }
        
     
    //   int[] temp = new int[d];
    //     int j = 0;
    //     for(int i = arr.length-1;i>d;i--){
    //         temp[j] = arr[i];
    //         j++;
    //     }

    //    for(int i = d; i>=0; i--){
    //       arr[i+d] = arr[i];
    //    }

    //    for(int i = 0; i<d; i++){
    //     arr[i] = temp[i];
    //    }

    //    for(int num : arr){
    //     System.out.print(num+" ");
    //    }


    //    sc.close();
    // }


    // #2 optimal approach  
    public static void reverse(int[] arr,int start , int end){

      while(start<end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
      }
    }
   public static void Rightrotate(int[] arr,int d){
       int n = arr.length;
       d = d%n;
       reverse(arr,0,n-1);
       reverse(arr,d,n-1);
       reverse(arr,0,d-1);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int d = sc.nextInt();

        for(int i = 0; i<arr.length; i++){
          arr[i] = sc.nextInt();
        }

        Rightrotate(arr,d);

        for (int num : arr) {
            System.out.print(num+" ");
        }

        sc.close();

    }
}
