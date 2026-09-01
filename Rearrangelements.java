import java.util.Scanner;
class Rearrangeelements{

      public static int[] Rearrange(int [] arr){
           int n = arr.length;

           int positive = 0;
           int negative = 1;

           int arr2[] = new int[n];

           for(int i = 0; i<n ; i++){
             if(arr[i]<0){
              arr2[negative] = arr[i];
              negative = negative+2;
           }else{
              arr2[positive] = arr[i];
              positive = positive+2;
           }
        }

        return arr2;
            
      }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


           int n = sc.nextInt();

           int arr[] =  new int[n];


           for(int i = 0; i<arr.length; i++){
               arr[i] = sc.nextInt();
           }

        int[]  result =  Rearrange(arr);

        for(int x : result){
            System.out.print(x+" ");
        }




    }
}