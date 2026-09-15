import java.util.Scanner;
public class DoublyLinked_Deletionatpos {
    static  class DNode{
        int data;
        DNode next;
        DNode prev;

        DNode(int data, DNode next, DNode prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        DNode(int data){
            this.data = data;
        }

    }
    public  static DNode changearrtoDll(int arr[]){
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

    public static DNode Deleteatpos(DNode head , int pos){
        if(pos == 1){
            head= head.next;
            head.prev = null;
            return  head;
        }
        DNode temp = head;

        for(int i = 1; i<pos; i++){
            temp =  temp.next;
        }

        if (temp.next == null) {
            temp.prev.next = null;
            return head;
        }

        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;

        return  head;

    }

    public static void main(String[] args){
             int[] arr = {12,23,34,45,56};

          DNode head  =   changearrtoDll(arr);

          Scanner sc = new Scanner(System.in);

          System.out.print("Enter the position : ");
          int pos = sc.nextInt();




          DNode head2   =      Deleteatpos(head,pos);

          while(head2 != null){
              System.out.print(head2.data+" ");
              head2 = head2.next;
          }
    }
}
