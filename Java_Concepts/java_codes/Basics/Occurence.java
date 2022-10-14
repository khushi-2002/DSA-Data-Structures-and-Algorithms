import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int Occurence=0;
        int n = sc.nextInt();
        while(a!=0){
          Long digit = a%10;
          if (digit==n){
            Occurence++;
          }
          a=a/10;
        }
        System.out.println(Occurence);
        sc.close();
    }
}
