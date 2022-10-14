public class Max {
    public static void main(String[] args) {
        int [] arr ={12,34,56,67};
        System.out.println(maximum(arr));
        System.out.println(maximumRange(arr, 0, 2));

    }

    // Assuming our array is not empty
    static int maximum(int []arr){

        if(arr==null){
            return -1;
        }
        int max = arr[0];
        //max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max= Math.max(max, arr[i]);
        }

        return max;
    }

    static int maximumRange(int []arr, int start, int end){

        if(arr.length==0){
            return -1;
        }

        if(start>end){
            return -1;
        }
        int max = arr[0];
        //max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            max= Math.max(max, arr[i]);
        }

        return max;
    }
}
