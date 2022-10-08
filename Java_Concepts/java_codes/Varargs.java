
import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        // print(23,45,23,21,21,12,7,5,2);
        // something(12, 56, "Khushi", "Agarwal");

        fun(23,45,231,23);
        fun("Khushi");
       // fun()  Ambiquity cause varargs can have 0 arguments, thus causing confusion which have to choose
    }

    static void print(int ...v){
    System.out.println(Arrays.toString(v));
    }

    static void something(int a, int b, String ...s){
        System.out.println(a+" "+b+" "+Arrays.toString(s));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
