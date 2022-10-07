import java.util.Scanner;

public class CaseChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().trim().charAt(0); 
        // sc.next stores the string upto space thus I need to remove all the white space and then want one character

        System.out.println("Khushi".charAt(0));
        
        if (a>=97 && a<=120){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
       
        sc.close();
        
    }
}
