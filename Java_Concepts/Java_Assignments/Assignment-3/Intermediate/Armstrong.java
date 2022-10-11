import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(is_armstrong(n));

        sc.close();
    }

    static boolean is_armstrong(int n){

        int original_number=n;
        int result=0;

        while(n!=0){
            int digit=n%10;
            result+=Math.pow(digit,3);
            n=n/10;
        }
        if(original_number==result){
            return true;
        }
        return false;
    }
}
