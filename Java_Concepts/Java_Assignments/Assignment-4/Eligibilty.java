import java.util.Scanner;

public class Eligibilty {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 eligibility(n);
 sc.close();
    }

    static void eligibility(int n){
        if(n>=18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}
