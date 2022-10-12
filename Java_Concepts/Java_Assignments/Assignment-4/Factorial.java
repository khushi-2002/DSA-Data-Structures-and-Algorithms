

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fact(n));
        sc.close();
    }

    static int fact(int n){
        int result=1;
        while(n!=1){
           result*=n;
           n--;
        }
        return result;
    }
}
