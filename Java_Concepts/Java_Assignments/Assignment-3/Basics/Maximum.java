import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int largest=0;

        while(true){
            int a = sc.nextInt();
            if(a==0){
                break;
            }
            else{
                largest=Math.max(largest,a);
            }
        }
        System.out.println(largest);
        sc.close();
    }
}
