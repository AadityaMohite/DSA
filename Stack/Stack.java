import java.util.Scanner;
class stackImplementation{
    int arr[];
    int size;
    int top = -1;


    stackImplementation(int size){
        this.size = size;
        arr = new int[size];
    }

    public void Push(int num){
        if(top == size-1){
            System.out.print("Stack is Overflow");
            return;
        }
        else{
            top++;
            arr[top] = num;
        }
    }

    public int Pop(){
        if(top == -1){
            System.out.print("Stack is underflow");
            return -1;
        }else{
            int num = arr[top];
            top--;
            return num;
        }
    }
    public int Peek(){
        if(top == -1){
            System.out.print("Stack is underflow");
            return -1;
        }else{
            int num = arr[top];
            return num;
        }
    }
    public void Display(){
        for(int i= top;i>=0; i--){
            System.out.println(arr[i]+" ");
        }
    }
}




public class Stack{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the size of the stack : ");
         int size = sc.nextInt();

         stackImplementation st = new stackImplementation(size);

         int choice;

         while(true){
             System.out.println("  1. Push , 2.Pop, 3.Peek, 4.Display ,5.Exit");
              choice = sc.nextInt();

              switch(choice){
                  case 1 : System.out.println("Enter the number to push : ");
                            int num = sc.nextInt();
                            st.Push(num);
                  break;
                  case 2 : int result = st.Pop();
                           System.out.print(result);
                  break;
                  case 3: int num1 =  st.Peek();
                        System.out.print("peek element is : "+num1);
                  break;
                  case 4 : st.Display();
                  break;
                  case 5 : System.out.print("Exit...");
                        sc.close();
                        return;
                  default : System.out.println("Invalid Choice");
              }
         }
    }
}