import java.util.Scanner;
public class CircularQueue {
    int arr[];
    int front = -1;
    int rear = -1;
    int size ;
    CircularQueue(int size){
        this.size = size;
        arr = new int[size];
    }

    public void enqueue(int data){

        if((rear+1)%size == front){
            System.out.println("Queue is Full");
            return;
        }

        if(front == -1){
            front = 0;
        }

        rear = (rear+1)%size;
        arr[rear] = data;
        System.out.println(data+ " data is inserted");
    }

    public void dequeue(){
        if(front == -1){
            System.out.println("Queue is empty");
        }


        System.out.println(arr[front]+" id data deleted from queue");

        if(front == rear){
            front = -1;
            rear = -1;
        }

        front = (front+1)%size;

    }

    public void display(){
        if(front == -1){
            System.out.println("Queue is full");
        }

     int  i = front;

        while(true){
            System.out.print(arr[i]+" ");

            if(i == rear){
                break;
            }

            i = (i+1)%size;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();


      CircularQueue q =  new CircularQueue(n);

      while(true){

          System.out.println("1.Enqueue");
          System.out.println("2.Dequeue");
          System.out.println("3.Display");
          System.out.println("4.Exit");
          System.out.println("Enter the choice : ");
          int option = sc.nextInt();

          switch(option){
              case 1 : System.out.println("Enter the data : ");
                       int data = sc.nextInt();
                       q.enqueue(data);
              break;

              case 2 : q.dequeue();
              break;

              case 3 : q.display();
              break;

              case 4 : System.out.println("Exit ...");
              return;

              default : System.out.println("Enter the invalid option ");
              break;
          }
      }

    }



}
