import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<=2){
            System.out.println(n);
        }

        else{
            int a=0;
            int b=1;
            System.out.print(a+" "+b+" ");

            for(int i=3;i<=n;i++){
                int result=a+b;
                System.out.print(result+" ");
                a=b;
                b=result;
            }
        }
        sc.close();
    }
}
