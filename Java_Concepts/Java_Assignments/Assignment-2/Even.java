import java.util.Scanner;

public class Even{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int  number = sc.nextInt();
       if(is_even(number)){
        System.out.println("Even Number");
       }
       else{
        System.out.println("Odd Number");
       }
       sc.close();

    }

    static boolean is_even(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}

