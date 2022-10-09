public class CSACylinder {
    public static void main(String[] args) {
        // curved surface area= 2*PI*r*h
        // Total surface area = 2pirh+2pir^2

        int r=10;
        int h=12;

        System.out.println(2*Math.PI*r*h);
        System.out.println(2*Math.PI*r*h+2*Math.PI*Math.pow(r, 2));
    }
}
