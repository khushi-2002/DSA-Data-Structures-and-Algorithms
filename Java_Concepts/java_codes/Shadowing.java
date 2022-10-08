public class Shadowing {
    static int a=90;
    public static void main(String[] args) {
        System.out.println(a);
        int a=89; // shadowing and hides the upper variable scope
        System.out.println(a);
        fun();
    }

    static void fun(){
        System.out.println(a);
    }
}
