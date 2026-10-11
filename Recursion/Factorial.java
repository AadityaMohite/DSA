import java.util.Scanner;
public class Factorial {
    public static int Fact(int n){


          if(n==0){
            return 1;
        }else{
            return Fact(n-1)*n;
        }


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the Number : ");
        int  n = sc.nextInt();


      int result =  Fact(n);

       System.out.println("Factorial of Number is : "+result);

    }
}
