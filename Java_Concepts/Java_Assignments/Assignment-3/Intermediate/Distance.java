import java.util.Scanner;

public class Distance {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x1=sc.nextInt();
    int x2=sc.nextInt();
    int y2=sc.nextInt();
    int y1=sc.nextInt();
 

    double ans = Math.pow(y2-y1, 2)+ Math.pow(x2-x1, 2);
    ans = Math.sqrt(ans);
    System.out.println(ans);
    sc.close();
}    
}
