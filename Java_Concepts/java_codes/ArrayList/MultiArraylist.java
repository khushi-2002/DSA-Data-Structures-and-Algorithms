import java.util.ArrayList;
import java.util.Scanner;

public class MultiArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(10);

        // Intilization (without this it'll give us an error)
        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<>());
        }
Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
              arr.get(i).add(sc.nextInt());
           } 
        }
        System.out.println(arr);
        sc.close();
    }
}
