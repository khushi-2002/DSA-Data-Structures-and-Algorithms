import java.util.Arrays;
import java.util.Scanner;

public class Array_objects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] str = new String[5];

        for (int i = 0; i < str.length; i++) {
            str[i]=sc.nextLine();


        }
sc.close();
        System.out.println(Arrays.toString(str));
    }
}
