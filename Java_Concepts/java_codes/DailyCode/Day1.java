

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Question: Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
*/
public class Day1 {
    public static void main(String[] args) {
       
       int []arr = {
        12, 23, 45, 67
       };
       int target = 68;
       System.out.println(search_pairs(arr, target));
       System.out.println(search_pairs2(arr, target));
       }
// Approach 1 - Using For loop 
       static boolean search_pairs(int []arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
       }
        return false;
      
    }

// Approach 2 -- Using Map
    static boolean search_pairs2(int []arr, int target){
        if(arr.length==0 || arr==null){
            return false;
        }
        ArrayList<Integer> m = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            
            if(m.contains(target-arr[i])){
                return true;
            }

            m.add(arr[i]);

        }
        return false;
    }
// Approach 3 - Using ArrayList
    static boolean search_pairs3(int []arr, int target){
        if(arr.length==0 || arr==null){
            return false;
        }
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            
            if(m.containsKey(target-arr[i])){
                return true;
            }

            m.put(arr[i], i);

        }
        return false;
    }
}

