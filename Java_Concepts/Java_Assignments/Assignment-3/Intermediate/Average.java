import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int count=0;
        while(true){
          int a = sc.nextInt();

          if(a==0){
            break;
          }
          else{
            sum+=a;
            count++;
          }
        }

        System.out.println(sum/count);
        sc.close();
    }
}
