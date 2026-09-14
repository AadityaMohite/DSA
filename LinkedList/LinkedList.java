import java.util.Scanner;


public class LinkedList{
  static   class Node{

        int data ;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public  static Node convertarrLL(int arr[]){

          Node head = new Node(arr[0]);

          Node mover = head;

          for(int i = 1; i<arr.length; i++){
             Node temp = new Node(arr[i]);
             mover.next = temp;
             mover = temp;
          }


        return head;
    }

    public static int checklength(Node head){
     
        int count = 0;
        Node temp = head;

        while(temp!=null){
            temp = temp.next;
            count++;
        }

        return count;
    }


   public static void main(String [] args){
        // int arr[] = {5,6,10,12,16};

         Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

      Node head  = convertarrLL(arr);

      int count = checklength(head);

       System.out.println(count);

    Node temp = head;

    while(temp!=null){
        System.out.print(temp.data+" ");
        temp = temp.next;
    }

   
          sc.close();
   }

    
}