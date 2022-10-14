import java.util.Scanner;

public class Arrays{
    public static void main(String[] args) {
        int []arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            arr[i]= sc.nextInt();
            sc.close();
        }

    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }

    for (int i : arr) {
        System.out.print(i+" ");   
    }
    System.out.println();
    System.out.println(java.util.Arrays.toString(arr));

    }
}