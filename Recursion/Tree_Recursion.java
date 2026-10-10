import java.util.Scanner;
public class Tree_Recursion {

    public static void Tree(int n){

        if(n>0){
            System.out.print(n+" ");
            Tree(n-1);
            Tree(n-1);
        }


    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int n = sc.nextInt();


        Tree(n);
    }
}
