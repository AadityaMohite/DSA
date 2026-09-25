import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class StackusingQueue {

    Queue<Integer> q = new LinkedList<>();

    public   void Push(int num){


        q.add(num);

        int size = q.size();

        for(int i = 1; i<size; i++){
            q.add(q.remove());
        }

         System.out.println(num+" Number is Pushed ");

    }

    public  int POP(){

        if(q.isEmpty()){
            return -1;
        }
        int num = q.remove();

        return num;


    }

    public  void Peek(){
 if(q.isEmpty()){
     System.out.println("Stack is Underflow");
 }

    int num = q.peek();

   System.out.println("Peek element is : "+num);

    }

    public  void display(){

         if(q.isEmpty()){
             System.out.println("Stack is Empty");

         }

        for(int num : q){
            System.out.print(num+" ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        StackusingQueue st = new StackusingQueue();

        while(true){
            System.out.println("Enter the choice : ");
            int choice = sc.nextInt();
            switch(choice){
                case 1 : System.out.println("Enter the number : ");
                         int num = sc.nextInt();
                         st.Push(num);
                break;
                case 2 : int val = st.POP();
                         System.out.println("Popedup value is : "+val);
                break;
                case 3 : st.Peek();
                break;
                case 4 : st.display();
                break;
                default : System.out.println("this is Invalid Choice");
            }

        }



    }
}
