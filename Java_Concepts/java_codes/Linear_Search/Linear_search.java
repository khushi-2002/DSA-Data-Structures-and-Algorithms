import java.util.Scanner;

public class Linear_search{
  public static void main(String[] args) {
    int []arr = {12, 34,45, 67};
    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();
    System.out.println(index(arr, target));
    System.out.println(element(arr, target));
    System.out.println(result(arr, target));
    sc.close();
  }


  static int index(int [] arr, int target){
    if(arr.length==0){
        return Integer.MIN_VALUE;
    }
    for (int i = 0; i < arr.length; i++) {
        if(target == arr[i]){
            return i;
        }
    }

    return Integer.MIN_VALUE;
  }


  static int element(int []arr, int target){
    if(arr.length==0){
      return Integer.MIN_VALUE;
    }
    else{
      for (int i : arr) {
        if(i==target){
          return i;
        }
      }
    }
    return Integer.MIN_VALUE;
  }

  static boolean result(int []arr, int target){
    if(arr.length==0){
      return false;
    }
    else{
      for (int i : arr) {
        if(i==target){
          return true;

        }
      }
    }

    return false;
  }
}