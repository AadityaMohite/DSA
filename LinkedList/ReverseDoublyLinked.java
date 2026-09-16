public class ReverseDoublyLinked {
    static class DNode{
        int data;
        DNode next;
        DNode prev;

        DNode(int data , DNode next , DNode prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        DNode(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static DNode convertarrLL(int arr[]){
        DNode head = new DNode(arr[0]);
        DNode mover = head;

        for(int i = 1; i<arr.length; i++){
            DNode temp = new DNode(arr[i]);
            mover.next = temp;
            temp.prev = mover;
            mover = temp;
        }
        return head;
    }
    public static DNode reverseDLL(DNode head){
        DNode nextnode = null;
        DNode current = head;
        DNode newhead = null;

        while(current!=null){
            nextnode = current.next;
            current.next = current.prev;
            current.prev = nextnode;
            newhead = current;
             current =  current.prev;
        }

        return  newhead;

//        while(current!=null){
//            prev = current.prev;
//            current.prev = current.next;
//            current.next = prev;
//            current = current.prev;
//        }
//        return prev.prev;
    }
    public static void main (String[] args){

        int arr[] = {1,2,3,4,5};

        DNode head = convertarrLL(arr);

        DNode head2 = reverseDLL(head);

        DNode temp = head2;

        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
