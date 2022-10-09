import java.util.Scanner;

public class Product_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digits(n));
        sc.close();

    }
    
    

    static int digits(int n){
        int result=0;
        int sum=0;
        int product=1;
        while(n!=0){
           int digit = n%10;
           sum+=digit;
           product*=digit;       
           n=n/10;   
        }

    result= product-sum;
    return result;

    }

}
