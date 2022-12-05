public class digits_count {
    public static void main(String[] args) {
        int value=90;
        System.out.println(digit(value));
    }

    static int digit(int value){
        return (int) Math.log10(value)+1;
    }
}
