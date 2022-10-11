import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int lcm=12;

        for(int i=Math.max(a,b);i<=a*b;i=i+Math.max(a,b)){
            // System.out.println(i);
            if(i%a==0 && i%b==0){
                 lcm=i;
                 break;
            }
        }     System.out.println((a*b)/lcm);
    sc.close();
    }
}
