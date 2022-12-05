

import java.util.Scanner;

public class Try_catch_Exception {


    public static void main(String[] args) {
        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        j = sc.nextInt();
        
        try{
            int k = i/j;
            System.out.println(k);
        }catch(ArithmeticException e){
            System.out.println("No no J value is wrong!");
        }

        sc.close();
        
    }
}

