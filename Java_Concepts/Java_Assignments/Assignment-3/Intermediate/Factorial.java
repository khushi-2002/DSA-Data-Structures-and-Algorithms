import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(factorial(a));
        sc.close();
        

    }

    static int factorial(int n){
       int ans=1;

       if(n<=1){
        return 1;
       }
       else{
        while(n!=1){
            ans*=n;
            n--;
        }
       
       }

return ans;
    }
}
