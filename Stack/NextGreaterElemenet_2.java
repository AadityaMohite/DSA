import java.util.Scanner;
import java.util.Stack;
public class NextGreaterElemenet_2 {
    public static void main(String[] args){
        int[] arr = {2,10,12,1,11};

        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        int result[]  = new int [n];


        Stack<Integer> st = new Stack<>();

        for(int i = 2*n-1; i>=0; i--){
            while(!st.isEmpty() && arr[i%n]>= st.peek()){
                st.pop();
            }

            if(i<n){
                if(st.isEmpty()){
                    result[i]=-1;
                }else{
                    result[i] = st.peek();
                }
            }

            st.push(arr[i%n]);
        }

        for(int i = 0; i<n; i++){
            System.out.print(result[i]+" ");
        }


    }
}
