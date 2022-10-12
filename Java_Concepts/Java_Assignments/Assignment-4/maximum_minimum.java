import java.util.Scanner;

public class maximum_minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maximum =0;
        int minimum=0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        maximum=maximum(a,b,c);
        System.out.println(maximum);
        minimum = minimum(a,b,c);
        System.out.println(minimum);
       sc.close();

    }

    static int maximum(int a, int b, int c){
        int max=a;

        if(max<b){
            max=b;
        }
        if(max<c){
            max=c;
        }

        return max;
    }

    static int minimum(int a, int b, int c){
        int min=0;

        min = Math.min(a,b);
        min = Math.min(min,c);
        return min;
    }
}
