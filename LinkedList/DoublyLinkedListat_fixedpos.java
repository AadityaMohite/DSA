import java.util.Scanner;

public class DoublyLinkedListat_fixedpos {
    static class DNode {
        int data;
        DNode next;
        DNode prev;

        DNode(int data, DNode next, DNode prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        DNode(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static DNode changearrto_DLL(int arr[]) {

        DNode head = new DNode(arr[0]);

        DNode mover = head;

        for (int i = 1; i < arr.length; i++) {
            DNode temp = new DNode(arr[i]);
            mover.next = temp;
            temp.prev = mover;
            mover = temp;
        }

        return head;
    }

    public static DNode  insertbegin(DNode head) {
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

    public  static DNode insertatposition(DNode head,int pos,int data) {
        DNode newNode = new DNode(data);
        DNode temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
          newNode.next = temp.next;
          newNode.prev = temp;
          temp.next = newNode;
          newNode.next.prev = newNode;

           return head;
    }


    public static void main(String[] args) {
        int arr[] = { 12, 23, 34, 45, 56 };

        DNode head = changearrto_DLL(arr);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the pos to insert num : ");
        int pos = sc.nextInt();

        if(pos<1) {
            System.out.println("Enter the valid Position ");

        }else if(pos == 1) {

            DNode head2 =  insertbegin(head);

            DNode temp = head2;

            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;

            }
        } else if (pos>1) {

            Scanner sc2 = new Scanner(System.in);

                System.out.println("Enter the data : ");
                int data = sc.nextInt();



                    DNode   head3   =        insertatposition(head,pos,data);

                    DNode temp = head3;
                    while(temp!=null) {
                        System.out.print(temp.data+" ");
                        temp = temp.next;
                    }

        }


//        DNode temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
        }
    }
