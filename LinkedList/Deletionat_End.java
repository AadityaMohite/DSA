class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
};

public class Deletionat_End {

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

    public static Node Deletion_from_End(Node head) {
        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }

    public static void main(String[] args) {

        int arr[] = { 12, 23, 34, 45, 56 };

        Node head = changearrtoLL(arr);

        Node head2 = Deletion_from_End(head);

        Node temp = head2;
        while (temp != null) {

            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }
}
