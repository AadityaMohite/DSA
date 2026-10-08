import java.util.Scanner;
public class Recursion_Example {


//    public static void Fun(int n){
//
//        if(n>0){
//            System.out.print(n+" ");
//            Fun(n-1);
//        }
//    }

    public static void Fun(int n){
        if(n>0){
            Fun(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        Fun(n);



    }
}
