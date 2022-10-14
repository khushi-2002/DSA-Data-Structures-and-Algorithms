import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> arr = new java.util.ArrayList<>(10); // can add more items
        arr.add(23);
        arr.add(12);
        arr.add(12);
        arr.add(18);
        arr.add(234);
        arr.add(56);
        arr.add(12);
        arr.add(89);

        // Methods

        System.out.println(arr.contains(234)); 
        arr.set(0, 23433);
        arr.remove(2);

        // user input arraylist
Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            arr.add(sc.nextInt());
            
        }

        sc.close();

        // getting elements from the arraylist

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i)); // arr[i] will not work here
        }

        System.out.println(arr);
    }
}
