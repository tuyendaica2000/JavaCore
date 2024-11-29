import java.util.Scanner;

public class bai9_toantu3ngoi {
    public static void main(String[] args) {
        //Nhập vào bàn phím 1 số xong kiểm tra chẵn - lẻ.
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Nhập số bạn cần kiểm tra: ");
        int n = sc.nextInt();
        String traloi = (n%2==0) ? "Chẵn" : "Lẻ";
        System.out.println("Số "+n +" là số " +traloi);
*/
        System.out.println("Nhập điểm trung bình của bạn: ");
        double dtb = sc.nextDouble();
        //xử lí
        String xeploai = (dtb >= 8) ? "GIỎI" :
                ((dtb < 8 && dtb >= 6.5) ? "KHÁ" :
                        ((dtb < 6.5 && dtb >=5) ? "TRUNG BÌNH" : "YẾU"));
        System.out.println("HỌC LỰC CỦA BẠN LÀ: "+xeploai);
    }
}
