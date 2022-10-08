import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        for(int i=num1;i<=num2;i++){
            if(is_armstrong(i)){
                System.out.println(i);
            }
        }

    }

    static boolean is_armstrong(int n){
        int original=n;
        int result=0;

        while(n!=0){
            int digit=n%10;
            result=result+(int)Math.pow(digit, 3);
            n=n/10;
        }
     return original==result;
    }
}
