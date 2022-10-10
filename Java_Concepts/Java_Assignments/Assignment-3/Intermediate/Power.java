import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        int p = sc.nextInt();

        System.out.println(power(number,p));
        sc.close();
    }
    
    static int power(int n, int p){
        int ans=n;

        while(p!=1){
            ans*=ans;
            p--;
        }

        return ans;
    }
}
