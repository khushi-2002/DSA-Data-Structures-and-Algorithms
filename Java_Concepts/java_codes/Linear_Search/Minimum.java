public class Minimum {
    public static void main(String[] args) {
        
    }

    static int mini(int [][]arr){
        int minimm = Integer.MAX_VALUE;

        for (int[] is : arr) {
            for( int is2 : is) {
                if(minimm>is2){
                    minimm =is2;
                }
                
            }
        }

        return minimm;
    }
}


