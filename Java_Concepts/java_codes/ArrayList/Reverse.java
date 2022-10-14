import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int []arr = {213, 4, 23, 67, 90};

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int []arr){
        int s=0;
        int e= arr.length-1;

        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
