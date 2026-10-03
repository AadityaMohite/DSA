import java.util.Scanner;
public class Queue {

    int size ;
    int rear = -1;
    int front = 0;
    int arr[];

    Queue(int size ){
        this.size = size;
        arr = new int[size];

    }

    public  void enqueue(int data ){

        if(rear == size-1){
            System.out.println("Queue is Full ");

        }
        else{
            rear++;
            arr[rear] = data;
        }

    }

    public int dequeue(){
        int data = -1;
        if(front  > rear ){
            System.out.println("Queue is Empty ");

        }else{

            data = arr[front];
            front++;

        }
        return data;
    }

    public void display(){
        if(rear < front ){
            System.out.println("Queue is empty ");

        }else{
            for(int i = front; i<=rear; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    public int  peek(){
        if(rear < front){
            System.out.println("Queue is empty ");
        }else{
            int data = arr[front];
            return data;
        }
        return -1;
    }

    public static void main(String[]args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the size of the queue : ");
          int  n = sc.nextInt();

          Queue q = new Queue(n);



          while(true){

              System.out.println("1. Enqueue");
              System.out.println("2 . Dequeue");
              System.out.println("3.  Display ");
              System.out.println("4 . peek");
              System.out.println("5 . Exit");




              System.out.println("Enter the choice : ");
              int option = sc.nextInt();



              switch(option){
                  case 1 : System.out.println("Enter the data : ");
                           int data = sc.nextInt();
                           q.enqueue(data);

                  break;

                  case 2 : int result = q.dequeue();
                           System.out.println(result + " is removed from queue");
                  break;

                  case 3 : q.display();
                  break;

                  case 4 : int peek = q.peek();
                           System.out.println("peek element is : "+peek);
                  break;

                  case 5 : System.out.println("Exit ...");
                    return;

                  default : System.out.println("Invalid output ");


              }
          }




    }
}
