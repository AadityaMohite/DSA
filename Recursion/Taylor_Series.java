import java.util.Scanner;
public class Taylor_Series {
    static int p = 1;
    static int f = 1;
    public static int e(int x, int n){
        int r;

        if(n==0){
            return 1;
        }else{
             r = e(x,(n-1));
             p = p * x;
             f = f * n;

             return r+p/f;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int x = sc.nextInt();

        System.out.println("Enter the Power : ");
        int n = sc.nextInt();



      int result =  e(x,n);
      System.out.println("Taylor Series : "+result);
    }
}
