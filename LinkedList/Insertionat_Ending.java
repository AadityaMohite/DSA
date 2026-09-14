import java.util.Scanner;

public class Insertionat_Ending {
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

    public static Node convertarrLL(int arr[]){

        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

         return head;
        
    }

    public static void insertion_ending(Node head){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the data to insert at end : ");
        int n = sc.nextInt();

        
        Node newnode = new Node(n);
         Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newnode;

        sc.close();

    }

    
    public static void main(String[] args){

        int arr[] = {12, 34, 45, 56};

           Node head =    convertarrLL(arr);

             insertion_ending(head);

             Node temp = head;

             while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
             }

             
                   
    }




}
