import java.util.Scanner;

public class First{
   public static void main(String[] args){

    // For printing on console
    System.out.println("Hello World!");

    // For taking input from the user
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();

    // Takes input upto whitespace
    System.out.println(sc.next());
    
    // Takes next line upto enter
    System.out.println(sc.nextLine());
    System.out.println(a);

    sc.close();



   }
}
