public class Maximum {
    public static void main(String[] args) {
        int []arr = {23,56,12,34};
        System.out.println(maximum(arr));

    }

    static int maximum(int[]arr){
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maximum){
              maximum = arr[i];
            }
        }

        return maximum;
    }
}


