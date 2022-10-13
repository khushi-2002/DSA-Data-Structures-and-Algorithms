import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        // int [][]arr = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        // System.out.println(arr.length); // no of rows
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         System.out.println(arr[i][j]);
        //     }
            
        // }
        Scanner sc = new Scanner(System.in);
        int [][]arr = new int[3][];


        for (int i = 0; i < arr.length; i++) {
            for  (int j = 0; j < arr.length; j++) {
               arr[i][j]= sc.nextInt(); 
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.print(is2+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }

        sc.close();
    }
}
