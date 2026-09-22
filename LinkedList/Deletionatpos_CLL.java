import java.util.Scanner;
public class Deletionatpos_CLL {
    static class Node{
        int data;
        Node next;
        Node(int data , Node next){
            this.data = data;
            this.next = next;
        }

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node ChangearrtoCLL(int arr[]){

        Node head = new Node(arr[0]);

        Node mover = head;

        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        mover.next =head;
        return head;
    }
    public static Node Deletionat_pos(Node head, int pos){
        Node temp = head;
        for(int i = 1; i<pos-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    public static void DisplayCLL(Node head){
        Node temp = head;
        while(temp.next!= head){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
    public static void main(String[] args){
        int arr[] = {12,23,34,45,56};

        Node head = ChangearrtoCLL(arr);

        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        if(pos == 1){
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
        }else{
         Node head2 =   Deletionat_pos(head,pos);
         DisplayCLL(head2);
        }
    }
}
