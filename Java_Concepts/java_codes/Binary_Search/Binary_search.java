public class Binary_search {
    public static void main(String[] args) {
       int []arr = {23, 45,12,10, 6};
       System.out.println(Binary(arr, 67));


    
    }

    static int Binary(int []arr, int target){
           
       int s = 0;
       int e = arr.length-1;
       int mid = s+(e-s)/2;

       while(s<=e){
        if(target==arr[mid]){
             return mid;
        }

        else if(target>arr[mid]){
            s=mid+1;
        }
        else{
            e=mid-1;
        }
        mid= s+(e-s)/2;
       }
       return -1;
    }
}
