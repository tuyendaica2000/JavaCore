import java.util.Scanner;

public class BaiTap_JavaCore {
    public static void main(String[] args) {

        /* BÀI 1
        * Viết chương trình nhập 1 số cho tới khi nhập đúng số cần nhập thì hiện thông báo thành công.
        * Số lần nhập tối đa 5 lần nếu nhập sai thì sẽ dừng chương trình và hiện thông báo nhập lỗi.
        */

        /*Scanner sc = new Scanner(System.in);
        int soCanTim = 16;
        int soLanNhap = 0;
        int soNhap;

        // CÁCH 1:
        while (soLanNhap < 5){
            System.out.println("Mời bạn nhập vào số cần tìm, trong khoảng 0-50 nhé. ");
            int n = sc.nextInt();
            soLanNhap++;

            if (n == soCanTim){
                System.out.println("Bạn đã tìm ra đúng số cần tìm: " + soCanTim +" là số cần tìm.");
                System.out.println("Bạn đã nhập "+soLanNhap +" lần mới tìm ra số cần tìm.");
                break;
            }
        }

        if (soLanNhap==5){
            System.out.println("Bạn đã nhập hết số lần cho phép. Xin cảm ơn.");
        }
------------------------------------------------------------------------------------------------------------------------
        // Cách 2:
        for (int i = 0; i<5; i++){
            System.out.println("Nhập số lần " + (i+1) +":");
            soNhap = sc.nextInt();
            if (soNhap == soCanTim){
                System.out.println("Bạn mất "+(i+1) +" lần nhập để tìm ra số cần tìm. "+"\nBạn đã tìm thành công!");
            }
        }
        System.out.println("Bạn đã nhập tối đa số lần cho phép. Xin cảm ơn.");



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        /* BÀI 2:
        * Viết chương trình tính tiền điện, cho phép nhập số điện đã dùng trong tháng.
        * Giả thiết 100 số đầu tính giá 1000đ/1 số, kể từ 100 số tính giá 1500đ/số, kể từ 150 số tính giá 2000đ/số
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện nhà bạn đã dùng trong tháng qua: ");
        int n = sc.nextInt();
        int tienDien = 0;
        int soDien = n;

        if (soDien>0 && soDien <100){
            tienDien = soDien * 1000;
        }
        else if (soDien>=100 & soDien<150) {
            tienDien = soDien * 1500;
        }
        else if (soDien>=150) {
            tienDien = soDien *2000;
        }
        System.out.println("Số tiền điện tháng này nhà bạn phải đóng là: " +tienDien +" VNĐ");
    }
}
