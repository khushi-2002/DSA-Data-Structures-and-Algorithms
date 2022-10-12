

import java.util.Scanner;



public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = prod(a,b);
        System.out.println(c);
        sc.close();
    }

    static int prod(int a, int b){
        return a*b;
    }
}
