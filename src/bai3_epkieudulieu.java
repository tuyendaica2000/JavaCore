public class bai3_epkieudulieu {
    public static void main(String[] args) {
        // ép kiểu rộng: Bé >> Lớn
        int a = 5;
        int b = 10;
        double kq = (double) a/b;
        System.out.println(kq);

        // ép kiểu hẹp: Lớn >> bé
        int c = 128;
        int d = (byte) c;
        System.out.println(c);
        System.out.println(d);
    }
}
