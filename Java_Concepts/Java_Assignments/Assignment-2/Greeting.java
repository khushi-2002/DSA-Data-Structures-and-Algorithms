import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(greet(s));
        sc.close();

    }

    static String greet(String name){
        return "Hello "+name;
    }
}
