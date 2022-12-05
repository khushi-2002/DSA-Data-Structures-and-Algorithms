

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Try_Catch_finally {
    public static void main(String[] args) throws IOException {
        try(BufferedReader b = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(b.readLine());
            System.out.println(n);
        }
        
    }
}
