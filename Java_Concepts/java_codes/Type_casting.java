import java.util.Scanner;

public class Type_casting {
    public static void main(String[] args) {

        // Implicitly conversion
        float a;
        Scanner sc = new Scanner(System.in);
        a= sc.nextFloat();
        System.out.println(a);
        sc.close();
        // Explicitly conversion

        int small = (int)56.7;
        System.out.println(small);
        // Automatic type promotion in expression

        byte b=4;
        int c = b*b; 
        // Converting the byte result into an integer
        System.out.println(c);

        // Introduction to Loops and conditions
     
    // While Loop
        int count = 1;
        while(count!=3){
            System.out.println(count);
            count++;
        }
    // If conditions
        if(true){
            System.out.println("I am a girl");

        }

    // For loop
        for(int i=89;i<=90;i++){
            System.out.println(a);
        }
    }
}
