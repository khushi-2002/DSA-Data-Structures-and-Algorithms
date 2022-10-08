import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
         
        int s=0;
        int e=str.length()-1;
        int flag=0;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                flag=1;
                break;
            }
            s++;
            e--;
        }
        if(flag==1){
            System.out.println("Not a palindrome");
        }
        else{
            System.out.println("Palindrome");
        }

    }
}
