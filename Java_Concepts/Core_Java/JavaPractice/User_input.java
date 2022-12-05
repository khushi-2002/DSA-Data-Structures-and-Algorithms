

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

public class User_input  {
    public static void main(String[] args) throws ArithmeticException, IOException{

        
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(i);
        int n = Integer.parseInt(b.readLine());
        int p = Integer.parseInt(b.readLine());
        int j = n/p;
        System.out.println(j);
        System.out.println(n);

        

    }
}
