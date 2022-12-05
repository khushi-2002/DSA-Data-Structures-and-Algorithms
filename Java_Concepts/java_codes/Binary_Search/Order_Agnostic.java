public class Order_Agnostic {
    public static void main(String[] args) {
        int []arr = {23,12,3,1};
        System.out.println(order(arr, 1));
    }

    static int order(int []arr, int target){
         int s = 0;
         int e=arr.length-1;

         if(s>e){
            return desc(arr, target);
         }
         else{
             return asc(arr, target);
         }

    }

    static int asc(int []arr, int target){
        int s = 0;
        int e=arr.length-1;
        int mid = s+(e-s)/2;

        while(s<=e){
            if(target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            mid = s+(e-s)/2;
        }

        return -1;
    }

    static int desc(int []arr, int target){
        int s=0;
        int e= arr.length-1;
        int mid = s+(e-s)/2;

        while(s<=e){
            if(target>arr[mid]){
                e=mid-1;
            }
            else if(target<arr[mid]){
                s=mid+1;
            }
            else{
                return mid;
            }
            mid = s+(e-s)/2;
        }

        return -1;
    }
}
