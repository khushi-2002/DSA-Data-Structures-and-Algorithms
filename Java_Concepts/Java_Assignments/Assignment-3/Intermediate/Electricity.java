import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        float cost_per_unit = sc.nextFloat();

        System.out.println(unit*cost_per_unit);
        sc.close();
    }
}
