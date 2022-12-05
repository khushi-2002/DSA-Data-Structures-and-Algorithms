public class Searching_2D_Array {
    public static void main(String[] args) {
        int [][]arr = {
            {12,34,56},
            {45,67,13,678},
            {12}
        };
        int[]ans = searching(arr, 89);
        System.out.println(java.util.Arrays.toString(ans));
    }

    static int [] searching(int [][]arr, int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }
}


