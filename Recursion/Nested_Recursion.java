import java.util.Scanner;
public class Nested_Recursion {
    public static int fun(int n){
        if(n>100){
            return n-10;
        }else{
           return fun(fun(n+11));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number : ");
        int  n = sc.nextInt();

          int result = fun(n);
          System.out.print(result);
    }
}
