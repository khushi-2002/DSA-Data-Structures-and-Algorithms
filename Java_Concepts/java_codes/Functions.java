import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
    //    nothing(); 
    //    int ans = sum();
    //    System.out.println(ans);

    //    String greet = greeting();
    //    System.out.println(greet);
     
    int ans = sum1(23, 12);
    System.out.println(ans);


    Scanner sc = new Scanner(System.in);
    String name = sc.next();

    String personalised_name = message(name);
    System.out.println(personalised_name);
    sc.close();
    }

    // static void nothing(){
    //     System.out.println("I don't return anything!");
    // }

    // static int sum(){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     return a+b;
    // }

    // static String greeting(){
    //     return "Khushi Agarwal";
    // }

    // Passing integer
    static int sum1(int a, int b){
        return a+b;
    }

    // Passing string

    static String message(String greet){
        return "Hii "+ greet;
    }

    

}
