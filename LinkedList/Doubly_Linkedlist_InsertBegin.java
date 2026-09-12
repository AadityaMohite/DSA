import java.util.Scanner;
class DNode {
    int data;
    DNode next ;
    DNode prev ;

    DNode(int data, DNode next , DNode prev){
      this.data = data;
      this.next = next;
      this.prev = prev;
    }
    DNode(int data){
     this.data = data;
     this.next = null;
     this.prev = null;
    }
};

public class Doubly_Linkedlist_InsertBegin {
     public static DNode changearrto_DLL(int arr[]){ 
 
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

    public static DNode insert_begin(DNode head){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the data : ");
        int data = sc.nextInt();

        DNode newnode = new DNode(data);

        head.prev = newnode;
        newnode.next = head;
        head = newnode;
        sc.close();
        return  head;
    }
    public static void main(String[] args){
        
            //   int arr[] = {12,23,34,45,56};

            Scanner sc = new Scanner(System.in);
            

            System.out.println("Enter the size of an Linkedlist : ");
            int n = sc.nextInt();


            int arr[] = new int[n] ;

            for(int i = 0;i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
             
          DNode head =  changearrto_DLL(arr); 

        DNode head2 =  insert_begin(head);

        DNode temp = head2;

        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

          sc.close();
    }
}
