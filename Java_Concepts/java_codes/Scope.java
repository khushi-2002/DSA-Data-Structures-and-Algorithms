public class Scope {
    public static void main(String[] args) {
        int a =10;
        System.out.println(a);

        {
           a=89;

        }

        System.out.println(a); // change the value of a
    }
}
