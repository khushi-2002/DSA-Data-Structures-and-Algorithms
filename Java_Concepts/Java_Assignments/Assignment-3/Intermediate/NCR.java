import java.util.Scanner;

public class NCR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int ncr = fact(n)/fact(n-r);
        System.out.println(ncr);

        int npr = fact(n)/(fact(r)*fact(n-r));
        System.out.println(npr);
        sc.close();
    }

    static int fact(int n){
        int result = 1;
        while(n!=1){
            result*=n;
            n--;
        }
        return result;
    }
}
