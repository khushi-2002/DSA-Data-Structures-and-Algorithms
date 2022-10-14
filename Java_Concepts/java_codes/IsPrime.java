import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isprime(n));
        sc.close();
    }

    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }

        return true;

    }
}
