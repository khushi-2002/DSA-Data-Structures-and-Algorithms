import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factor(n);
        sc.close();

    }

    static void factor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print("Factor is ");
                System.out.println(i);
            }
            
        }
    }
}
