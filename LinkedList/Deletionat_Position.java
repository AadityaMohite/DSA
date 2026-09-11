import java.util.Scanner;
class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }
};

public class Deletionat_Position {
    public static Node changearrtoLL(int[] arr) {
        Node head = new Node(arr[0]);

        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
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

    public static Node Deletionat_Position(int pos , Node head){

        if (head == null || head.next == null) {
            return null;
        }

        if(pos==0){
            head = head.next;
            return  head;
        }
        Node temp = head ;
        
        for(int i = 0; i<pos-1; i++){
          
          temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;

    }
    public static  void main(String [] args){

         int arr[] = { 12 ,23,34,45,56};

        Node head = changearrtoLL(arr);

        int count = checklength(head);

       Scanner sc = new Scanner(System.in);

         System.out.println("Enter the Position to be delete : ");
         int pos = sc.nextInt();

         if(pos>count){
            System.out.println("Invalid Position is Entred ");
         }else{
                   Node head2   =     Deletionat_Position(pos,head);

                   while(head2 != null){
                    System.out.print(head2.data+" ");
                    head2 = head2.next;
                   }
         }


         sc.close();

    }
}
