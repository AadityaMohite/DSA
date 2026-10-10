import java.util.Scanner;
public class Indirect_Recursion {
    public static void Fun_A(int n){

        if(n>0){
            System.out.print(n+" ");
            Fun_B(n-5);
        }

    }
    public static void Fun_B(int n){
        if(n>1){
            System.out.print(n+" ");
            Fun_A(n/5);
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        Fun_A(n);

    }
}
