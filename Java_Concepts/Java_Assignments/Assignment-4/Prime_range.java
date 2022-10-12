import java.util.Scanner;

public class Prime_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=a;i<=b;i++){
            if(prime(i)){
                System.out.println(i);
            }
        }
        sc.close();
    }

    static boolean prime(int n){
        if(n>=2){
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
        
        
    }
}
