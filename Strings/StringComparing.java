import java.util.Scanner;
public class StringComparing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the String 1");
        String s1 = sc.nextLine();

        System.out.println("Enter the String  2");
        String s2 = sc.nextLine();


        char ch[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        boolean equal = true;


       for(int i = 0; i<ch.length && i<ch2.length; i++){
           if(ch[i]==ch2[i]){
               continue;
           }else if(ch[i]>ch2[i]){
               System.out.println("String 2 is Smaller");
               equal = false;
               break;
           }else if(ch[i]<ch2[i]){
               System.out.println("String 1 is Smaller");
               equal = false;
               break;
           }
       }


        if(equal){
            System.out.println("equal");
        }



    }
}
