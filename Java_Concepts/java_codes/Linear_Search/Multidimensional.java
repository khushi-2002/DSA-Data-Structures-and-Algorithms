import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        int[][] arr = {
            {12,34,45},
            {23,56,12},
            {89,56,78}
        };

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(java.util.Arrays.toString(search(arr, target)));
        sc.close();

    }

    static int[] search(int[][] arr, int target){
        int [] result = new int[2];
        if(arr.length == 0){
            
            result[0]= -1;
            result[1]= -1;
            return result;
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if(target== arr[i][j]){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }

        result[0]=-1;
        result[1]=-1;
        return result;
    
    }
}
