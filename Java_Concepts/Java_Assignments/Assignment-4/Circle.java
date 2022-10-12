

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.println(circumference(r));
        System.out.println(area(r));

        sc.close();
    }

    static double circumference(int r){
        double c = 2*Math.PI*r;
        return c;
    }

    static double area(int n){
       return Math.PI*Math.pow(n, 2);
    }
}
