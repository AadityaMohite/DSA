import java.util.Scanner;
class Node{

    int data ;
    Node next ;

    Node(int data , Node next){
      this.data = data ;
      this.next = next;
    }

    Node(int data){
        this.data = data;
    }
};

public class Insertafter_Node {
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
    public static int checklength(Node head){
     
        int count = 0;
        Node temp = head;

        while(temp!=null){
            temp = temp.next;
            count++;
        }

        return count;
    }

    public static void  insertion_after(Node head,int n,int pos){

        Node newnode = new Node(n);

        Node temp = head;

        for(int i = 1; i<pos ; i++){
            temp = temp.next;
        }

          newnode.next = temp.next;
          temp.next = newnode;
    }


    public static void main(String[] args){
         
         int arr[] = {12, 34, 45, 56};

           Node head =    convertarrLL(arr);

           int count = checklength(head);

              Scanner sc = new Scanner(System.in);

                int pos = sc.nextInt();

                if(pos>count){
                    System.out.println("Invalid Position !");
                }else{
                    System.out.println("Enter the data to insert : ");
                    int n = sc.nextInt();
                         insertion_after(head,n,pos);

                         Node temp = head;
                         while(temp != null){
                            System.out.print(temp.data+" ");
                            temp = temp.next;
                         }
                }
               
                sc.close();

    }
}
