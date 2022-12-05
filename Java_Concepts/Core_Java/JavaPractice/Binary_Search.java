

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        int []arr = new int[5];
        Scanner sc = new Scanner (System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
         
        int target;
       target= sc.nextInt();

        // Binary Search Algorithm

        int s = 0;
        int e = arr.length;
        int mid = (s+e)/2;

        while(s<=e){
            if(arr[mid]==target){
               System.out.println(mid);
            }

            else if(arr[mid]>target){
                e = mid-1;
            }

           else if(arr[mid]<target){
                s = mid+1;
            }

            mid = (s+e)/2;
        }
        sc.close();
    }


}
