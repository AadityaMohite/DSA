public class Deletionat_CLL {
    static class Node{
        int data;
        Node next;

        Node(int data , Node next){
            this.data = data;
            this.next = next;
        }

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node changearrtoCLL(int arr[]){
        Node head = new Node(arr[0]);

        Node mover = head;

        for(int i =1; i<arr.length; i++){
            Node temp = new Node (arr[i]);
            mover.next = temp;
            mover = temp;
        }

        mover.next = head;

        return head;
    }
    public static Node Deletion_from_Begin(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;

        return head;
    }

    public static void DisplayCLL(Node head){
        Node temp = head;
        while(temp.next!= head){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data+" ");
    }
    public static void main(String [] args){

        int arr[] = {12,23,34,45};

        Node head = changearrtoCLL(arr);

        Node head2 = Deletion_from_Begin(head);

        DisplayCLL(head2);
    }
}
