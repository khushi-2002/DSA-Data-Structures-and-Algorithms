import java.util.Scanner;

public class Leap{
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n= sc.nextInt();

            System.out.println(leap(n));
            sc.close();
    }

    static boolean leap(int n){
        if(n%4==0){
            if(n%100==0){
                if(n%400==0){
                    return true;
                }
                else{
                    return false;
                }

            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }
}
