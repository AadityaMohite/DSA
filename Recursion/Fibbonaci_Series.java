import java.util.Scanner;
public class Fibbonaci_Series {
    public static int fibbo(int n){
        if(n<=1){
            return n;
        }else{
            return fibbo(n-2)+fibbo(n-1);
        }
    }
    public static void main(String [] args){

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        for(int i = 0; i<=n; i++) {
            System.out.print(fibbo(i)+" ");

        }
        sc.close();

    }
}
