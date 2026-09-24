import java.util.Scanner;
public class StackusingLinkedList {

    static class Node{

        int data;
        Node next;


        Node(int data){
            this.data = data;
            this.next = null;
        }

        Node (int data, Node next){
            this.data = data;
            this.next = next;
        }


    }

    Node top = null;

    public  void Push(int num){
       Node newnode = new Node(num);

       newnode.next = top;
       top = newnode;

       System.out.println(num+" Number is Pushed");


    }

    public void POP(){
        if(top == null){
            System.out.println("Stack is Underflow");

        }else{
            int num = top.data;

            System.out.println(num+" Number is POPed");
            top = top.next;

        }
    }

      public void  Peek(){
        if(top == null){
            System.out.println("Stack is underflow");

        }else{
            int num = top.data;
            System.out.println("Peek element is : "+num);
        }
      }

      public void Display(){

          if(top == null){
              System.out.println("Stack is Empty");
              return;
          }
          else{
              Node temp = top;
              while(temp != null){
                  System.out.print(temp.data+" ");
                  temp = temp.next;
              }
              System.out.println();
          }


      }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        StackusingLinkedList st = new StackusingLinkedList();

        int choice;


        while(true){

            System.out.println("1 .Push");
            System.out.println("2 .POP");
            System.out.println("3 .Peek");
            System.out.println("4 .Display");
            System.out.println("5 .Exit");
            System.out.println("Enter the Choice: ");
             choice = sc.nextInt();


             switch(choice){
                 case 1 : System.out.println("Enter the Number to Pushed");
                          int num = sc.nextInt();
                          st.Push(num);
                 break;
                 case 2 :  st.POP();
                 break;
                 case 3 :  st.Peek();
                 break;
                 case 4 : st.Display();
                 break;
                 case 5 : System.out.println("Exit...");
                 return;
                 default : System.out.println("Enter the valid Choice");
             }





        }




    }

}
