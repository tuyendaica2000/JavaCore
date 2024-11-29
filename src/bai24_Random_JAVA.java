import java.util.Random;

public class bai24_Random_JAVA {
    public static void main(String[] args) {
        // Khởi tạo 1 đối tượng ngẫu nhiên
        Random rd = new Random();

        //Lấy 1 số nguyên ngẫu nhiên
        int soNguyen = rd.nextInt(-10,17); //chạy từ: -10 cho đến <11
        System.out.println(soNguyen);

        //Lấy 1 số thực ngẫu nhiên
        double x = rd.nextDouble(99,100);
        System.out.println(x);
    }
}
