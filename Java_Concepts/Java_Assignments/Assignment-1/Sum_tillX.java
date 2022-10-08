import java.util.Scanner;

public class Sum_tillX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum=0;
        while(true){
            int n = sc.nextInt();
            if(n==120){
                break;
            }
            sum+=n;
            
        }

        System.out.println(sum);
          sc.close(); 
     

    }
}
