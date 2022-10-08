public class Swaping {
    public static void main(String[] args) {
        int a =20;
        int b=34;

        // int teemp=a;
        // a=b;
        // b=teemp;

        // System.out.println(a+" "+b);

        swap(a, b);
        System.out.println(a+" "+b);
        String name = "Khushi Agarwal";
        change_name("Khushi Agarwal");
        
    }

    static void swap(int a, int b){
        int temp =a;
        a=b;
        b=temp;
    }

    static void change_name(String name){
        name ="Anything";
    }
}
