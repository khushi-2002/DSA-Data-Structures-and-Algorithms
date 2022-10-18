import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int result=0;
        while(a!=0){
            int digit = a%10;
            result=result*10+digit;
            a/=10;
        }

        sc.close();

        System.out.println(result);
    }
}
