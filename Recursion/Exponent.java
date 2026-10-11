import java.util.Scanner;
public class Exponent {
    public static int Pow(int m, int n){
        if(n==0){
            return 1;
        }else{
            return Pow(m,n-1)*m;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int m = sc.nextInt();

        System.out.println("'Enter the Power : ");
        int n = sc.nextInt();

       int result =  Pow(m,n);
       System.out.println(result);

    }
}
