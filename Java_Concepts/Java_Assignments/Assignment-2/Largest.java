import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        sc.close();
        if(n1>n2){
            System.out.println(n1+" is largest");
        }
        else{
            System.out.println(n2+" is largest");
        }
    }
}
