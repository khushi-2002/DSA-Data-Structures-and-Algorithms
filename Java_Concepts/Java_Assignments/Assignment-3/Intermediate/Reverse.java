import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int s = 0;
        int e= a.length()-1;
        String b="";
        while(s<=e){
            b = b + a.charAt(e);
            e--;
         }
        System.out.println(b);
        sc.close();
        


    }
}
