import java.util.Scanner;
public class Queue {

    int size ;
    int rear = -1;
    int front = -1;
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
        if(front == rear ){
            System.out.println("Queue is Empty ");

        }else{
            front++;
            data = arr[front];

        }
        return data;
    }

    public void display(){

    }

    public static void main(String[]args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the size of the queue : ");
          int  n = sc.nextInt();

          Queue q = new Queue(n);



          while(true){
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


              }
          }




    }
}
