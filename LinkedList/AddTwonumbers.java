public class AddTwonumbers {
    static  class Node{
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
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(-1);

        Node current = dummy;
        Node temp1 = l1;
        Node temp2 = l2;
        int carry = 0;
        while(temp1!=null || temp2!=null ) {

            int sum = carry;
            if(temp1!=null){
                sum += temp1.data;
                temp1 = temp1.next;
            }
            if(temp2!=null){
                sum+= temp2.data;
                temp2 = temp2.next;
            }
          Node newnode = new Node(sum%10);
            carry = sum/10;
            current.next = newnode;
             current = newnode;
        }

        if(carry>0){
            Node newnode = new Node(carry);
            current.next = newnode;
        }
            return dummy.next;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int arr2[] = {12 , 23 ,34 ,45,56};
        Node head = changearrtoLL(arr);
        Node head2 = changearrtoLL(arr2);
        Node result = addTwoNumbers(head, head2);

        Node temp = result;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
