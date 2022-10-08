import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = sc.next().trim().charAt(0);
        int num1 = sc.nextInt();
        int num2= sc.nextInt();

        if(choice=='+'){
            System.out.println(num1+num2);
        }
        else if(choice=='-'){
            System.out.println(num1-num2);
        }
        else if(choice=='*'){
            System.out.println(num1*num2);
        }
        else if(choice=='/'){
            if (num2!=0){
                System.out.println(num1/num2);
            }
            
        }
        sc.close();
    }
}
