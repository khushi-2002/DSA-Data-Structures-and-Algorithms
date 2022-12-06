package Binary_search_ques;

public class Ceiling {
    public static void main(String[] args) {
        int []arr = {10,12,14,16,17,19};
        System.out.println(ceil(arr, 18));
    }
    

    static int ceil(int []arr, int target){
        int s = 0;
        int e = arr.length-1;
        int mid = s+(e-s)/2;

        while(s<e){
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                s=mid+1;            }
            else{
                e=mid-1;
            }
            mid = s+(e-s)/2;
        }

        return arr[e+1];

    }


}
