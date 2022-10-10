import java.util.Scanner;

public class Commission {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int amount = sc.nextInt();
    float percentage = amount/a;
    System.out.println(percentage*100);
    sc.close();
  }    
}
