import java.util.Scanner;
public class ChangingCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the String : ");
        String s = sc.nextLine();

        char ch[] = s.toCharArray();

        for(int i = 0; i<ch.length; i++){
            if(ch[i]>='a' && ch[i]<='z'){
                ch[i]-= 32;
            }else if(ch[i]>=65 && ch[i]<=90){
                ch[i]+= 32;
            }
        }

        String ss = new String(ch);

        System.out.println(ss);



    }
}
