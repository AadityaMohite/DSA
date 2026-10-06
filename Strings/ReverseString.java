import java.util.Scanner;
public class ReverseString {
    public static void ReverseString(char ch[]){
        int p = 0;
        int q = ch.length-1;
        while(p<q){
            char temp = ch[p];
            ch[p] = ch[q];
            ch[q] = temp;
            p++;
            q--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the String : ");
        String ss = sc.nextLine();
        char ch[] = ss.toCharArray();
        ReverseString(ch);
        String s =new String(ch);
        System.out.println(s);

    }


}
