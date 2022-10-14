import java.util.Arrays;

public class ChangeValues {
    public static void main(String[] args) {
        
        int arr[] = {45,78,12,34,12,12};
        System.out.println(Arrays.toString(arr));

        change(arr);
    }

    static void change(int []arr){
        arr[0]=78;
    }
}
