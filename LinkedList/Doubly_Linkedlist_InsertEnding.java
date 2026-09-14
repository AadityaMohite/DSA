import  java.util.Scanner;


public class Doubly_Linkedlist_InsertEnding {

  static   class DNode {

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

  public static DNode changetoarrDL(int arr[]) {
    if (arr == null || arr.length == 0) {
      return null;
    }

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

  public static DNode Insert_Ending(DNode head) {
    try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
      int data = sc.nextInt();

      DNode newNode = new DNode(data);

      if (head == null) {
        return newNode;
      }

      DNode temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }

      temp.next = newNode;
      newNode.prev = temp;
      newNode.next = null;

      return head;
    }
  }

  public static void main(String[] args) {
    int arr[] = {12, 23, 34, 45, 56};

    DNode head = changetoarrDL(arr);
    DNode head2 = Insert_Ending(head);

    DNode temp = head2;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }
}