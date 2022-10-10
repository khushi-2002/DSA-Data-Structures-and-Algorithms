import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        for(int i=Math.max(a,b);i<=a*b;i=i+Math.max(a,b)){
           if(i%a==0 && i%b==0){
             System.out.println(i);
             break;
           }
        }
    }
}
