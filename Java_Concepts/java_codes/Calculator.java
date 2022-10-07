import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.print("Enter your choice: ");
            char choice = sc.next().trim().charAt(0);
            if(choice=='+'|| choice =='-'|| choice=='*' || choice=='/'||choice=='%'){
                System.out.print("Enter two numbers ");
                int num1= sc.nextInt();
                int num2=sc.nextInt();
                 if(choice=='+'){
                    ans=num1+num2;
                 }

                 if(choice=='*'){
                    ans=num1*num2;
                 }

                 if(choice=='/'){
                    if(num2!=0){
                        ans=num1/num2;
                    }
                    else{
                        ans=0;
                    }  
                 }

                 if(choice=='%'){
                    ans=num1%num2;
                 }

                 if(choice=='-'){
                    ans=num1-num2;
                 }

            }
            else if(choice=='x' || choice=='X'){
                break;
            }else{
                System.out.println("Invalid operations");
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
