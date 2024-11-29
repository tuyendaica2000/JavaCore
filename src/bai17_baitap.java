import java.util.Scanner;

public class bai17_baitap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào a: ");
        double a = sc.nextDouble();
        System.out.println("Mời bạn nhập vào b: ");
        double b = sc.nextDouble();

        // Cho người dùng nhập chọn phép tính
        System.out.println("Nhập kí tự để thực hiện phép tính: + , - , * , /");
        String phepTinh = new Scanner(System.in).nextLine();
        switch (phepTinh){
            case "+":
                cong(a,b);
                break;
            case "-":
                tru(a,b);
                break;
            case "*":
                nhan(a,b);
                break;
            case "/":
                chia(a,b);
                break;
            default:
                System.out.println("Phím bấm không hợp lệ !!!");
                break;
        }
    }

    public static void cong(double a, double b) {
        double kq= a+b;
        System.out.println("Kết quả ta phép tính \"+\" ta được: " +kq);
    }
    public static void tru(double a, double b) {
        double kq1= a-b;
        System.out.println("Kết quả ta phép tính \"+\" ta được: " +kq1);
    }
    public static void nhan(double a, double b) {
        double kq2= a*b;
        System.out.println("Kết quả ta phép tính \"+\" ta được: " +kq2);
    }
    public static void chia(double a, double b) {
        if (b==0){
            System.out.println("Không thực hiện được phép tính chia khi b=0 !!!");
        }
        else{
            double kq3= a/b;
            System.out.println("Kết quả ta phép tính \"+\" ta được: " +kq3);
        }
    }
}
