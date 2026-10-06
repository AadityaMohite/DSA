import java.util.Scanner;
public class Palindrome {

    public static char[] checkpalindrome(char ch[] ){
        int p = 0;
        int q = ch.length-1;
        while(p<q) {
            char temp = ch[p];
            ch[p] = ch[q];
            ch[q] = temp;
            p++;
            q--;
        }


        return ch;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String s = sc.nextLine();

        char ch[] = s.toCharArray();


      char ch2[] =  checkpalindrome(ch);

        String ss = new String(ch2);

        if (s.equals(ss)) {

            System.out.println("String is palindrome");

        }else{
            System.out.println("String is not palindrome");
        }





    }
}
