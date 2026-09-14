import java.util.Scanner;




public class Doubly_Linkedlist_Insertafter {
   static class DNode{

        int data;
        DNode next;
        DNode prev;

        DNode(int data , DNode next , DNode prev ){
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
    
    public static DNode insert_begin(DNode head,int data){
       

        DNode newnode = new DNode(data);

        head.prev = newnode;
        newnode.next = head;
        head = newnode;
        
        return  head;
    }

    public static DNode Insertafter(DNode head ,int pos,int data){


            if(pos==0){
             DNode head2 =  insert_begin(head,data);
             return  head2;
            }
            

            DNode newNode = new DNode(data);

            DNode temp = head;


            for(int i = 1; i<pos; i++){
               temp = temp.next;
            }

            newNode.next = temp.next;

            newNode.prev = temp;

            if(temp.next!=null){
           temp.next.prev = newNode;
            }

            temp.next = newNode;
            
            return  head;
    }

 public static int checklength(DNode head){
     
        int count = 0;
        DNode temp = head;

        while(temp!=null){
            temp = temp.next;
            count++;
        }

        return count;
    }



    public static DNode chnagearrtoDL(int arr[]){
          DNode head = new DNode(arr[0]);

          DNode mover = head;

           for(int i =1 ; i<arr.length; i++){
            DNode temp = new DNode(arr[i]);

               mover.next = temp;
               temp.prev = mover;
               mover = temp;
           }

           return  head;

    }
    public static void main(String[] args){

        int arr [] = {12,23,34,45,56};


            DNode head =  chnagearrtoDL(arr);

            int count = checklength(head);


              Scanner sc = new  Scanner(System.in);

              int pos = sc.nextInt();

              System.out.println("Enter the data  to be insert : ");
              int data = sc.nextInt();
              if(pos>count){
                System.out.println("Invalid Position !");
              }
             else{
              DNode head2  =  Insertafter(head,pos,data);
               DNode temp = head2;
               while (temp!=null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
               }
             }
    }
}
