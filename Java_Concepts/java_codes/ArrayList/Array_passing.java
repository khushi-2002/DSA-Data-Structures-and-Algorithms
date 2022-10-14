import java.util.Scanner;

public class Array_passing {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            
            arr[i]= sc.nextInt();
            sc.close();
        }

        change(arr);
        
    }

    static void change(int []arr){
           arr[2]=90;
           System.out.println(java.util.Arrays.toString(arr));
    }
}
