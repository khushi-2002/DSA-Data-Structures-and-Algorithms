import java.util.Arrays;
import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcm(a, b));
        sc.close();
    }

    static String lcm(int a, int b){
        int []arr= new int[2];
        int maxi = Math.max(a, b);
        System.out.println(maxi);
         for(int i=maxi;i<=a*b;i=i+maxi){
            if(i%a==0 && i%b==0){
               arr[0]=i;
               break;
            }
         }

         arr[1]= (a*b)/arr[0];
         return Arrays.toString(arr);
    }
}
