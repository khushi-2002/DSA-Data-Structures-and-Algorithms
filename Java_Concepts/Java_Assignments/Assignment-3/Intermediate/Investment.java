import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
        int investment=0;
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int r= sc.nextInt();
        int n= sc.nextInt();

        investment=(amount*r*n)/100;
        System.out.println(investment);
        sc.close();
        
    }
}
