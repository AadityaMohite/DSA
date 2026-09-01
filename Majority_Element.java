import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Majority_Element {
    // Better approach 

    // public static int Majority(int[] arr){
         
    //     HashMap<Integer,Integer> map = new HashMap<>();


    //     for(int i = 0; i<arr.length; i++){
    //         map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
    //     }



    //     for(Map.Entry<Integer,Integer> m : map.entrySet()){
    //           if(m.getValue()>arr.length/2){
    //             return m.getKey();
    //           }
    //     }



    //     return 0;
    // }

    // Optimal approach

    public static int Majority(int[] arr){

      int candidate = 0 ;
      int count = 0;

      for(int i = 0; i<arr.length; i++){
          if(count == 0){
            candidate = arr[i];
          }
          if(arr[i] == candidate){
              count ++;
          }else{
            count --;
          }
      }
          int count1 = 0;
       for(int i = 0; i<arr.length;i++ ){
           if(candidate == arr[i]){
              count1++;
           }
       }
          
       if(count1>arr.length/2){
        return candidate;
       }else{
            return 0;
       }

        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


          int n = sc.nextInt();


          int[] arr = new int[n];

          for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
          }

        int result =  Majority(arr);

           System.out.println("Majority element is : "+result);


            sc.close();

    }
}
