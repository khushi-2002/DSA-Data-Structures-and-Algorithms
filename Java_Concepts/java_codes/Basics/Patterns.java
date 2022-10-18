import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        pattern1(n);

        sc.close();
    }


    static public void pattern1(int n){
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("$");
                }
            }
            else{
                for (int j = 1; j <= n; j++) {
                    if(j==1 || j==n){
                        System.out.print("$");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}
