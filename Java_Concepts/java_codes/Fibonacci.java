import java.util.Scanner;

import javax.xml.validation.Schema;

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

        System.out.println(result);
    }
}
