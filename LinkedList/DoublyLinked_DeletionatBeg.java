public class DoublyLinked_DeletionatBeg {
     static class DNode{
         int data;
         DNode prev;
         DNode next;
         DNode(int data,DNode prev,DNode next){
             this.data = data;
             this.next = next;
             this.prev = prev;
         }
         DNode(int data) {
             this.data = data;
         }
    }
    public  static  DNode changearrtodll(int arr[]){
         DNode head = new DNode(arr[0]);
         DNode mover = head;
         for(int i = 1; i<arr.length; i++){
             DNode temp = new DNode(arr[i]);

             mover.next = temp;
             temp.prev = mover;
             mover = temp;


         }
        return  head;
    }
    public static  DNode Deletenode_fromBeg(DNode head){
         head = head.next;
         head.prev = null;
         return  head;
    }
    public static  void main(String[] args){
          int arr[] = {12,23,34,45,56};

              DNode head       =  changearrtodll(arr);

           DNode head2  =   Deletenode_fromBeg(head);

           DNode temp = head2;

           while (temp!=null){
               System.out.print(temp.data+" ");
               temp = temp.next;
           }
    }
}
