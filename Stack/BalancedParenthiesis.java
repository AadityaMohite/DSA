import java.util.Scanner;
import java.util.Stack;
public class BalancedParenthiesis {
    public static boolean isValid(String str){
        Stack<Character> st = new Stack();
        for(char c : str.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char ch = st.pop();
                if(ch!='(' && c==')' ) return false;
                if(ch!='{' && c=='}') return false;
                if(ch!='[' && c==']') return false;
            }
        }
       return st.isEmpty();
    }
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);

          String str = sc.next();

          if(isValid(str)){
              System.out.println("This is balanced parenthesis");
          }else{
              System.out.println("This is not balanced parenthesis");
          }


    }
}
