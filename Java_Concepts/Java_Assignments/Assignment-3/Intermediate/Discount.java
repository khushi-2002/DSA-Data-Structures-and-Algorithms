import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int a = sc.nextInt();
       int disc = sc.nextInt();

       System.out.println(a*disc/100);
       sc.close();
    }
}
