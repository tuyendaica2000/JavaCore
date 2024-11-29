import java.util.Scanner;

public class bai26_VDstring {
    public static void main(String[] args) {
        /*
        * Nhập vào 1 chuỗi từ bàn phím để xem có
        * bao nhiêu kí tự  thường
        * bao nhiêu kí tự HOA
        * bao nhiêu kí tự số
        * bao nhiêu khoảng trắng.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kí tự bạn muốn kiểm tra:");
        String s = sc.nextLine();
        //Gán biến đếm = 0
        int demSo = 0;
        int demInthuong = 0;
        int demInhoa = 0;
        int demSpace = 0;
        for (int i = 0; i<s.length();i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)){
                demInthuong++;
            } else if (Character.isUpperCase(c)) {
                demInhoa++;
            } else if (Character.isDigit(c)){
                demSo++;
            } else if (Character.isWhitespace(c)) {
                demSpace++;
            }
        }
        System.out.println("Số lượng ký tự thường là: " +demInthuong);
        System.out.println("Số lượng ký tự in HOA là: " +demInhoa);
        System.out.println("Số lượng ký tự số là: " +demSo);
        System.out.println("Số lượng ký tự khoảng trắng là: " +demSpace);

    }
}
