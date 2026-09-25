import java.util.Scanner;
import java.util.Stack;
public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {12, 23, 34, 45, 56};
        int n = arr.length;

        int result[] = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] >= st.peek()) {
                st.pop();
            }

            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                int num = st.peek();
                result[i] = num;
            }

            st.push(arr[i]);
        }


        for(int i = 0; i<n; i++){
            System.out.print(result[i]+" ");
        }

    }
}




