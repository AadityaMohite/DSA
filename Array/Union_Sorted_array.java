import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;
public class Union_Sorted_array{

    //Brute force Approach 

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);

    //     TreeSet<Integer> set = new TreeSet<>();

    //     int n = sc.nextInt();

    //     int arr[] = new int[n];

    //     for(int i = 0; i<arr.length; i++){
    //         arr[i] = sc.nextInt();
    //         set.add(arr[i]);
    //     }

    //     int n1 = sc.nextInt();
    //     int arr1[] = new int[n1];

    //     for(int i = 0; i<arr1.length; i++){
    //         arr1[i] = sc.nextInt();
    //         set.add(arr1[i]);
    //     }


    //     int Union[] = new int[set.size()];

    //     int i =0;
    //     for(int num : set){
    //         Union[i++] = num;
    //     }
       
    //     for(int value : Union){
    //         System.out.print(value+" ");
    //     }
    //     sc.close();
   // }


   //Optimal Approach

   public static  ArrayList<Integer> Union(int[] arr,int[]arr1){
       int n1 = arr.length;
       int n2 = arr1.length;
       int i = 0;
       int j = 0;

       ArrayList<Integer> list = new ArrayList<>();
       while(i<n1 && j<n2){

           if(arr[i]<=arr1[j]){

              if(list.isEmpty() || list.get(list.size()-1)!=arr[i]){
                 list.add(arr[i]);
              }
               i++;
           }else{
                if(list.isEmpty() || list.get(list.size()-1)!=arr1[j]){
                    list.add(arr1[j]);
                }
                j++;
           }
       }
         
       while(i<n1){
        if(list.isEmpty()||list.get(list.size()-1)!=arr[i]){
            list.add(arr[i]);
        }
        i++;
       }
       while(j<n2){
        if(list.isEmpty()||list.get(list.size()-1)!=arr1[j]){
           list.add(arr1[j]);
        }
        j++;
       }

       return list;
   }

   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);



    int n = sc.nextInt();

    int arr[] = new int[n];

    for(int i = 0 ; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }

    int n1 = sc.nextInt();

    int arr1[] = new int[n1];

    for(int i =0; i<arr1.length;i++){
        arr1[i] = sc.nextInt();
    }

  ArrayList<Integer> list =  Union(arr,arr1);

   for(int num :list){
      System.out.print(num+" ");
   }


    sc.close();
   }
}