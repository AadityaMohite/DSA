import java.util.Scanner;
import java.util.Stack;
public class RemoveKdigits {


    public static String removekdigits(String s , int k){

        Stack<Character>  st = new Stack<>();

    for(int i = 0; i<s.length(); i++){
        char ch = s.charAt(i);

        while(!st.isEmpty() && k>0  &&  st.peek()>ch){
                   st.pop();
                   k--;
        }

        st.push(ch);
    }

        if (!st.isEmpty() && k>0) {

            st.pop();
            k--;
        }


          StringBuilder str = new StringBuilder();

        while(!st.isEmpty()){

            str.append(st.pop());

        }

         str.reverse();


        int i = 0;
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }

        int i2 = 0;
        while (i2 < str.length() && str.charAt(i2) == '0') {
            i2++;
        }

        str = new StringBuilder(str.substring(i));

        // If nothing remains
        if (str.length() == 0) {
            return "0";
        }
       return str.toString();
    }





    public static void main(String[] args){

      String s = "1432219";

      int k = 3;

      System.out.println(removekdigits(s,k));
    }
}
