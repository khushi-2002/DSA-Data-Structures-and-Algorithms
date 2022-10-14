import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int result=a;
        for(int i=2;i<=n;i++){
           result= a+b;
           a=b;
           b=result;
        }

        sc.close();

        System.out.println(result);
    }
}
