import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
public class FindingDuplicatesString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String s1 = sc.nextLine();


//        ArrayList<Character> list = new ArrayList<>();
//
           char ch[] = s1.toCharArray();
//
//           for(int i = 0; i<ch.length; i++){
//               for(int j = i+1; j<ch.length; j++){
//                   if(ch[i]==ch[j]){
//                       list.add(ch[i]);
//                   }
//               }
//           }
//           for(char c :list){
//               System.out.print(c+" ");
//           }


           HashSet<Character> seen = new HashSet<>();
           HashSet<Character> duplicate = new HashSet<>();

           for(char c  : ch){
               if(!seen.add(c)){
                   duplicate.add(c);
               }
           }

           System.out.println("Duplicates Character : ");

           for(char d : duplicate){
               System.out.print(d+" ");
           }

    }
}
