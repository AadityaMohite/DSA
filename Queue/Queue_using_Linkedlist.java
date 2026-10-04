import java.util.Scanner;
class Node{

    int data;
    Node next;

    Node(int data ){
        this.data = data;
        this.next = null;
    }

    Node(int data , Node next){
        this.data = data;
        this.next = next;
    }

}
public class Queue_using_Linkedlist {

    Node front = null;
    Node rear = null;

    public void enqueue(int data){

        Node newnode = new Node(data);

        if(front == null){
            front = newnode;
            rear = newnode;
        }
          else{
              rear.next = newnode;
              rear = newnode;
        }


    }

    public void dequeue(){
        if(front == null){
            System.out.println("Queue is Empty");
           return;
        }

        System.out.println(front.data+" data is deleted");
        front = front.next;

        if(front == null){
            rear = null;
        }
    }

    public void display(){
        if(front == null){
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();


    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Queue_using_Linkedlist q = new Queue_using_Linkedlist();

        while(true){

            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter the option : ");
            int option = sc.nextInt();


            switch(option){

                case 1 :  System.out.println("Enter the data : ");
                          int data = sc.nextInt();
                           q.enqueue(data);
                break;

                case 2 : q.dequeue();
                break;

                case 3 : q.display();
                break;

                case 4 : System.out.println("Exit ..");
                return;

                default : System.out.println("Invalid option");
                break;


            }
        }



    }
}
