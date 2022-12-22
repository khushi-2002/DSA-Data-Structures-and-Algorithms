public class Day2 {
    public static void main(String[] args) {
        
        int [] arr = {
            12, 34, 56
        };
        
        System.out.println(java.util.Arrays.toString(result1(arr)));
        System.out.println(java.util.Arrays.toString(result2(arr)));
        System.out.println(java.util.Arrays.toString(result3(arr)));
 
    }
// Approach 1
    static int [] result1(int []arr ){
        int []result = new int[arr.length];
        for (int index = 0; index < arr.length; index++) {
            int ans =1;
            for (int i = 0; i < arr.length; i++) {
                if(i==index){
                 continue;
                }

                ans = ans*arr[i];
                
            }

            result[index]=ans;

        }

        return result;
    }

// Approach 2

    static int [] result2(int []arr){
        int []result = new int[arr.length];
        int ans=1;
        for (int i = 0; i < arr.length; i++) {
            ans=ans*arr[i];
        }

        for (int i = 0; i < result.length; i++) {
            result[i]= ans/arr[i];
        }

        return result;
    }

// Approach 3

    static int [] result3(int []arr){

        int []result = new int[arr.length];
        result[0]=1;
        int x=1;
        for (int i = 1; i < arr.length; i++) {
            result[i]= result[i-1]*arr[i-1];
        }

        for (int i = arr.length-1; i >0; i--) {
            x = x*arr[i];
            result[i-1] = result[i-1]*x;
        }

        return result;
    }

}
