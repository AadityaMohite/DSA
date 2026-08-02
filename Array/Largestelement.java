
import java.util.Scanner;
public class Largestelement{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

  int[] arr = new int[n];

  for(int i = 0; i<arr.length; i++){
    arr[i] = sc.nextInt();
  }

    int max = 0;

    for(int num : arr){
      if(num>max){
        max = num;
      }
    }
      System.out.println("Maximum number : "+max);
     sc.close();
  }
}