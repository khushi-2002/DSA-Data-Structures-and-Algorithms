

import java.util.Scanner;

public class Jagged_array {
    public static void main(String[] args) {
        int [][]arr = new int[3][];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the no of elements that you want to store: ");
            int k = sc.nextInt();
            arr[i] = new int[k]; // memory allocated
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the row "+i+" and column "+j+" element.");
                arr[i][j] = sc.nextInt();
                
            }
        }

        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.println(is2);
            }
        }
        sc.close();
    }
}
