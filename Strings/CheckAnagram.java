import java.util.Scanner;
public class CheckAnagram {

    public static boolean Validanagram(String s1 , String s2){
        if(s1.length()!= s2.length()){
            return false;
        }
        int[] freq = new int[26];

        for(int i = 0; i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }

        for(int num : freq){
            if(num!=0){
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String 1 : ");
        String s1 = sc.nextLine();

        System.out.println("Enter the String 2 : ");
        String s2 = sc.nextLine();

         System.out.println(Validanagram(s1,s2));

    }
}
