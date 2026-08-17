import java.util.Scanner;
public class Sort0_1_2 {

    public static void Sort(int[]arr){
           int countzero = 0;
           int count_one = 0;
           int count_two = 0;

           for(int i = 0; i<arr.length; i++){
               if(arr[i]==0){
                  countzero++;
               }else if(arr[i]==1){
                count_one++;
               }else{
                  count_two++;
               }
           }

              int count = 0;

              for(int i = 0; i<countzero;i++ ){
                  arr[count++] = 0;
              }
              for(int i = 0; i<count_one; i++){
                  arr[count++] = 1;
              }

              for(int i = 0; i<count_two; i++){
                  arr[count++] = 2;
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
