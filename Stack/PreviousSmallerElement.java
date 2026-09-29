import java.util.Scanner;
import java.util.Stack;
public class PreviousSmallerElement {
    public static void main(String[] args){
        int arr[] = {2,10,12,1,11};

        int n = arr.length;

        int result[] = new int[n];

        Stack<Integer> st = new Stack<Integer>();

        for(int i = 0; i<arr.length; i++){
            while(!st.isEmpty() && st.peek()> arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                result[i] = -1;
            }
            else
            {
                   int num = st.peek();
                   result[i] = num;
            }


            st.push(arr[i]);
        }

          for(int i = 0; i<result.length; i++){
              System.out.print(result[i]+" ");
          }


    }
}
