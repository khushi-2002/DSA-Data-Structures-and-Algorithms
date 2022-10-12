

import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(pali(n));
        sc.close();
    }

    static boolean pali(int n){
        int original_number=n;
        int result =0;

        while(n!=0){
            int digit = n%10;
            result=result*10+digit;
            n=n/10;
        }

        if(result==original_number){
            return true;
        }
        else{
            return false;
        }
    }
}
