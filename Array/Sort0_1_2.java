import java.util.Scanner;
public class Sort0_1_2 {

    // Better Approach


    // public static void Sort(int[]arr){
    //        int countzero = 0;
    //        int count_one = 0;
    //        int count_two = 0;

    //        for(int i = 0; i<arr.length; i++){
    //            if(arr[i]==0){
    //               countzero++;
    //            }else if(arr[i]==1){
    //             count_one++;
    //            }else{
    //               count_two++;
    //            }
    //        }

    //           int count = 0;

    //           for(int i = 0; i<countzero;i++ ){
    //               arr[count++] = 0;
    //           }
    //           for(int i = 0; i<count_one; i++){
    //               arr[count++] = 1;
    //           }

    //           for(int i = 0; i<count_two; i++){
    //               arr[count++] = 2;
    //           }

    // }

        // Optimal approach *Dutch national flag*

        // public static void Swap(int[]arr,int a, int b){
        //     int temp = arr[a];
        //      arr[a] = arr[b];
        //      arr[b] = temp;
            

        // }

     public static void Sort(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid<=high){

          if(arr[mid]==0){
           int temp = arr[mid];
           arr[mid] = arr[low];
           arr[low] = temp;
            low++;
            mid++;
          }
          else if(arr[mid]==1){
               mid++;
          }else if(arr[mid]==2){
             int temp = arr[mid];
             arr[mid] = arr[high];
             arr[high] = temp;
             high--;
          }


        }



     }




    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);

          int n = sc.nextInt();

          int[] arr = new int[n];


          for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
          }

             Sort(arr);

               for(int x : arr){
                System.out.print(x+" ");
               }



        sc.close();
    }
}
