public class Triangle {
    public static void main(String[] args) {
        int a=45;
        int b=56;
        int c=78;

        float s =(a+b+c)/2;
        s= s*(s-a)*(s-b)*(s-c);
        System.out.println(Math.sqrt(s));

}
}
