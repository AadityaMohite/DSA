import java.util.Scanner;
public class Sum_Of_Natural {

    public static int Sum(int n){
        if(n == 0){
            return 0;
        }else{
            return Sum(n-1)+n;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

     int result =   Sum(n);
     System.out.println("Sum of Natural Number : "+result);

    }
}
