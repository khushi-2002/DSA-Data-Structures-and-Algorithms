import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result=0;
        int n=sc.nextInt();
        while(n!=0){
            int digit=n%10;
            result+=digit;
            n=n/10;
        }
        System.out.println(result);
        sc.close();
    }
}
