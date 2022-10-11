import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int ans=n;
        int result=0;
        while(ans!=0){
            int digit = ans%10;
            result = result*10+digit;
            ans=ans/10;
        }

        if(n==result){
            System.out.println("True");
        }
        else{
            System.out.println("Fslse");
        }

        sc.close();
    }
}
