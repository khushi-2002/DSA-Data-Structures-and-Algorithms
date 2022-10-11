import java.util.Scanner;

public class Compound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int principle = sc.nextInt();
        float rate = sc.nextFloat();
        int n = sc.nextInt();
        int t = sc.nextInt();

        float ans= principle*(1+rate/n);
        System.out.println(Math.pow(ans, n*t));

        sc.close();
    }
}
