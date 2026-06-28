public class Casting {
    public static void main(String[] args) {
        // int a = 10 ;
        // double b = a ;
        double a = 10.25;
        int b = (int) a;
        System.out.println("double to int : " + b);
        int c = 259;
        byte d = (byte) c; // it gives reminder of c%256
        System.out.println("int to byte : " + d);
        float e = 5.6f; // after float number write f anf for long l
        int f = (int) e;
        System.out.println("float to int : " + f);

        int m = 10;
        double n = 2.5;
        System.out.println(m * n);
    }
}
