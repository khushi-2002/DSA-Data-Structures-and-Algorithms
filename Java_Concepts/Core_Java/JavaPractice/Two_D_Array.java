

import java.util.Arrays;
import java.util.Scanner;

public class Two_D_Array {
    public static void main(String[] args) {
        int [][]arr = new int [3][2];

        System.out.println("Enter the values for the array elements");
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < 2; j++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the value of row "+i +" "+ "and column "+j);
                arr[i][j] = sc.nextInt();
                sc.close();
            }
        }
 

        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.println(is2);
            }
        }

       System.out.println(Arrays.deepToString(arr));

    }
}
