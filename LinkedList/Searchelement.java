import java.util.Scanner;


public class Searchelement {
  static   class Node{
        int data ;
        Node next;



        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node convertarrLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i = 1; i<arr.length; i++ ){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }
    public static boolean Searchelement(Node head , int target){

        Node temp = head;

        while(temp!=null){
            if(temp.data == target){
                System.out.println(temp.data);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

     int n = sc.nextInt();


     int[] arr = new int[n];

     for(int i = 0; i<arr.length; i++){
        arr[i] = sc.nextInt();
     }
           
     System.out.println("Enter the target Value to be searched : ");
     int target = sc.nextInt();


          Node head  = convertarrLL(arr);

         boolean check =  Searchelement(head,target);

         System.out.println(check);

        sc.close();
    }
}
