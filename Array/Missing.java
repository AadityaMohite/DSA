import java.util.Scanner;
public class Missing {
    // public static void main(String[] args){

    //     Scanner sc = new Scanner(System.in);

    //       int n = sc.nextInt();

    //     int[] arr = new int[n];


    //     for(int i= 0; i<arr.length-1; i++){
    //         arr[i] = sc.nextInt();
    //     }



    //     int sum1 = (n*(n+1))/2;

    //     System.out.println(sum1);

    //     int sum = 0; 



    //     for(int i = 0; i<arr.length-1; i++){
    //         sum = sum + arr[i];
    //     }
    //     System.out.println(sum);

    //     int result = sum1 - sum;

    //     System.out.println("Missing Number is : "+result);

    //      sc.close();   


    // }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


            int n = sc.nextInt();


            int[] arr = new int[n];

            for(int i =0; i<arr.length-1; i++){
                arr[i] = sc.nextInt();
            }

            int xor1 = 0;
            int xor2 = 0;

            for(int i= 0; i<arr.length-1; i++){
                xor1 = xor1^arr[i];
                xor2 = xor2^arr[i+1];
            }


            xor2 = xor2^n;

            int result = xor1 - xor2;

           System.out.println("Missing Number is : "+result);

        sc.close();
    }
}
