import java.util.Scanner;
public class ValidateString {

    public static boolean Valid(String s){

        char ch[] = s.toCharArray();

        for(char c : ch){
            if(!(c>=65 && c<=90) && !(c>=97 && c<=122) && !(c>=48 && c<= 57)){
                 return false;
            }
        }



          return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String s = sc.nextLine();

        if (Valid(s)) {
            System.out.println("String is Valid ");
        }else{
            System.out.println("String is not valid");
        }
    }
}
