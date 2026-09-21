import java.util.Scanner;
public class InsertionatPos_CLL {
    static class Node{
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
    }
    public static Node changearrtoCLL(int [] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i<arr.length ; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        mover.next = head;
        return head;
    }
    public static  Node InsertatPos(Node head , int data, int pos){
        Node newnode = new Node(data);


        if(pos == 1){
            Node temp = head;

            while (temp.next!=head){
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = head;
            head = newnode;
            return head;
        }

        Node temp = head;

        for(int i = 1; i<pos -1; i++){
          temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;

        return head;
    }
    public static void DisplayCLL(Node head){
        Node temp = head;

        while(temp.next != head){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String[] args){
        int arr[] = {12,23,34,45,56};

            Node head  =     changearrtoCLL(arr);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the data : ");
            int data = sc.nextInt();

            System.out.println("Enter the Position : ");
            int pos = sc.nextInt();





           Node head2 = InsertatPos(head,data,pos);

           DisplayCLL(head2);
    }
}
