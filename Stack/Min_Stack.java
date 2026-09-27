import java.util.Scanner;
import java.util.Stack;
public class Min_Stack {

    Stack<Integer> st = new Stack<>();
    int min = 0;


    public  void push(int val){

        if(st.isEmpty()){
            min = val;
            st.push(val);
        }else if(val>min){
            st.push(val);
        }else{
            st.push(2*val - min);
            min = val;
        }
        System.out.println(val+" is pushed into Stack");
    }

    public void pop(){

        if (st.isEmpty()) {

            System.out.println("Stack is Underflow ");
            return ;
        }
        int x = st.peek();

        st.pop();

        if(x<min){
            min = 2*min - x;
        }

    }

    public  int peek(){

        if(st.isEmpty()){
            return -1;
        }
        int x = st.peek();

       if(min<x){
           return x;
       }
       return min;
    }

    public  int get_min(){

        return min;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Min_Stack st = new Min_Stack();

        while(true){
              System.out.println("1.Push");
              System.out.println("2.POP");
              System.out.println("3.Peek");
              System.out.println("4.Get Min");

              System.out.println("Enter the Choice :");
              int option = sc.nextInt();

              switch(option){

                  case 1 : System.out.println("Enter the Number to Push : ");
                            int val = sc.nextInt();
                            st.push(val);
                  break;

                  case 2 :   st.pop();

                  break;

                  case 3 : int peek = st.peek();
                           System.out.println(peek+" ");
                  break;

                  case 4 : int result2 = st.get_min();
                           System.out.println(result2+" ");
                  break;

                  case 5:
                      sc.close();
                      System.out.println("Program Ended");
                      return;

                  default : System.out.println("Invalid option entered");



              }

        }


    }
}
