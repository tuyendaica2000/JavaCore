import java.util.Scanner;

public class bai7_Scanner {
    public static void main(String[] args) {
        // Đầu tiên, khởi tạo 1 đối tượng Scanner
        Scanner sc = new Scanner(System.in);

        /*// Cho phép nhập chuỗi
        System.out.println("Vui lòng nhập mật khẩu đăng nhập: ");
        String mk1 = sc.nextLine();
        System.out.println("Mật khẩu vừa nhập là: " +mk1);

        //Nhập số nguyên
        System.out.println("Mời nhập vào số nguyên: ");
        int a = sc.nextInt();
        System.out.println("Số nguyên a = " +a);

        //Nhập số float
        System.out.println("Mời nhập vào số thực x: ");
        float x = sc.nextFloat();
        System.out.println("Số thực x = " +x);

        System.out.println("Vui lòng nhập mật khẩu cấp 2: ");
        String mk2 = sc.nextLine();
        System.out.println("Mật khẩu vừa nhập là: " +mk2);

        // Nhập chuỗi
        System.out.println("Mời bạn nhập họ và tên: ");
        String ten= new Scanner(System.in).nextLine();
        System.out.println("Họ và tên bạn là: " +ten);

        // Nhập float
        System.out.println("Mời bạn nhập chiều cao của bạn: ");
        float cao= new Scanner(System.in).nextFloat();
        System.out.println("Đây là chiều cao của bạn: " +cao);

        // Nhập  giới tính
        System.out.println("Nhập giới tính của bạn: ");
        String gt = new Scanner(System.in).nextLine();
        System.out.println("giới tính của bạn: "+gt);

        // Nhập float
        System.out.println("Mời bạn nhập cân nặng của bạn: ");
        float cao2= new Scanner(System.in).nextFloat();
        System.out.println("Đây là cân nặng thực tế của bạn: " +cao2);

        //Bài tập
        System.out.println("Mời bạn nhập vào bán kính đường tròn r: ");
        double r = sc.nextDouble();
        double chuvi = 2 * Math.PI *r;
        double dt = Math.PI * Math.pow(r,2);
        System.out.println("Chu vi là: " +chuvi);
        System.out.println("Diện tích là: " +dt);*/

        // Bài tập: Tính chu vi và  diện tích hình chữ nhật
        System.out.println("Mời bạn nhập chieu dai a= ");
        float a = sc.nextFloat();
        System.out.println("Moi ban nhap chieu rong b= ");
        float b = sc.nextFloat();
        float p = (a+b)*2;
        float s = a*b;
        System.out.println("Chu vi hinh chu nhat p= "+p);
        System.out.println("Dien tich hinh chu nhat s= "+s);

    }
}
