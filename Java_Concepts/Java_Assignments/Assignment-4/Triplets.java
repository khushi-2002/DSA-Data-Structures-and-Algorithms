import java.util.Scanner;

public class Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(is_pytho(a,b,c));
        sc.close();
    }

    static boolean is_pytho(int a, int b, int c){
        if(a*a+b*b==c*c){
            return true;
        }
        else{
            return false;
        }
    }
}
