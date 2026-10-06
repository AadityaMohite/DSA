
import java.util.Scanner;
public class CountingCansonantsandVowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String ss = sc.nextLine();

        int casonuntcount = 0;
        int vowelcount = 0;
        char ch [] = ss.toCharArray();

        for(int i = 0; i<ch.length; i++){
            if(ch[i]=='a' || ch[i]=='i'|| ch[i]=='o'|| ch[i]=='e'||ch[i]=='u'||
               ch[i]=='A'|| ch[i]=='I'|| ch[i]=='O'||ch[i]=='E'||ch[i]=='U')
            {
                 vowelcount++;
            }else if(ch[i]>= 65 && ch[i]<=90 || ch[i]>=97 && ch[i]<=122){
                 casonuntcount++;
            }
        }

        System.out.println(" Number of Vowels : "+vowelcount);
        System.out.println("Number of Casonunt : "+ casonuntcount);


    }
}
