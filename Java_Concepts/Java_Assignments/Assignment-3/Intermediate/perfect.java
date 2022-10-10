import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        // perfect number = all divisors including itself
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result=0;
       for(int i=1;i<n;i++){
          if(n%i==0){
            result+=i;
          }
       }

       if(result==n){
        System.out.println("Perfect");
       }
       else{
        System.out.println("Not perfect");
       }

       sc.close();
    }
}
