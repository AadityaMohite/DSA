import java.util.Scanner;



public class Insertat_Begining {
   static class Node{

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
    public static Node convertarrLL(int arr[]){

        Node head = new Node (arr[0]);

        Node mover = head;

        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

         return head;

    }

      // Insertion at begining 
            public static Node insert_begining(Node head){

               Scanner sc = new Scanner(System.in);

               System.out.println("Enter the data : ");
               int n = sc.nextInt();

               Node temp = new Node(n,head);

               
               head = temp;

               sc.close();

                return head;

                
            }
    
    public static void main(String[] args){
          
        int arr[] = {12,23,45,56,67};

          Node head     =         convertarrLL(arr);

             Node head2  =        insert_begining(head);

             Node temp = head2;

             while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
             }

        //   Node temp = head;

        //   while(temp != null){
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        //   }

          



    }
}
