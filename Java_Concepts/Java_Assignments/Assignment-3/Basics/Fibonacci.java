import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
         
        fibonacci(n);

        sc.close();

    }
    
    static void fibonacci(int n){
        if(n<=2){
            System.out.println(0+" "+1);
        }
        else{
            int a=0;
            int b=1;
            System.out.println(a);
            System.out.println(b);

            for(int i=3;i<=n;i++){
                int result = a+b;
                a=b;
                b=result;
                System.out.println(result);
            }
        }
    }
}
