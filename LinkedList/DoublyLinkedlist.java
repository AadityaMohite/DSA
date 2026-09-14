;
 
public class DoublyLinkedlist {
   static class DNode{
        int data;
        DNode next;
        DNode prev;

        DNode(int data, DNode next, DNode prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        DNode(int data ){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static DNode changearrto_DLL(int arr[]){ 
 
        DNode head = new DNode(arr[0]); 
 
        DNode mover = head; 
 
        for(int i = 1; i<arr.length; i++){ 
            DNode temp = new DNode(arr[i],null,mover); 
            mover.next = temp; 
            mover = temp; 
        } 
 
 
         return head; 
 
    } 
    public static void main(String[]args){ 
 
        int arr[] = {12,23,34,45,56}; 
             
          DNode head =  changearrto_DLL(arr); 
 
          DNode temp = head; 
          while (temp != null) { 
            System.out.print(temp.data+" "); 
            temp = temp.next; 
          } 
 
    } 
} 
