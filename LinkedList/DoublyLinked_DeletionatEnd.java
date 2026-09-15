


public class DoublyLinked_DeletionatEnd {

    static class DNode{
        int data;
        DNode next;
        DNode prev;

        DNode(int data, DNode next, DNode prev){
            this.data = data;
            this.next = this.next;
            this.prev = prev;
        }

        DNode(int data){
            this.data = data;
        }
    }

    public  static DNode changearrtodll(int arr[]){
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

    public static DNode Deletionend(DNode head){

        DNode temp = head;

        while(temp.next.next!= null){
            temp = temp.next;
        }

       temp.next.prev = null;
        temp.next = null;

        return head;
    }


    public  static  void main(String[] args){
        int arr[] = {12,23,34,45,56};

        DNode head       =  changearrtodll(arr);

               DNode head2    =       Deletionend(head);

               while(head2 != null){
                   System.out.print(head2.data+" ");
                   head2 = head2.next;
               }


    }
}
