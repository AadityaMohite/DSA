
class ReverseLinkedList{
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
    public static Node changearrtoLL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i<arr.length; i++){

            Node temp = new Node(arr[i]);

            mover.next = temp;
            mover = temp;
        }
           return head;  
    }
    public static Node Reverselist(Node head){
        Node prevnode = null;
        Node currNode = head;
        Node nextNode = head;
        while(nextNode != null){
          nextNode = nextNode.next;
          currNode.next = prevnode;
          prevnode = currNode;
          currNode = nextNode;
        }
         head = prevnode;
         return  head;
    }
    public static void main(String[] args){
        int[] arr = {12,23,34,45,56};
       Node head = changearrtoLL(arr);
        Node head2 = Reverselist(head);
        while(head2 !=null){
           System.out.print(head2.data+" ");
           head2 = head2.next;
        }
    }
}