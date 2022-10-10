import java.util.Scanner;

public class sum_choices {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int sum_negative=0;
       int sum_even =0;
       int sum_odd=0;
       while(true){
        int n = sc.nextInt();

        if(n==0){
            break;
        }
        else if(n<0){
          sum_negative+=n;
        }

        else{
            if(n%2==0){
                sum_even+=n;
            }
            else{
                sum_odd+=n;
            }
        }
       }

       System.out.println(sum_even);
       System.out.println(sum_negative);
       System.out.println(sum_odd);

       sc.close();
    }

}
