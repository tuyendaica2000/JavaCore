import java.util.Scanner;

public class Bai26_BTTH5_String {
    public static void main(String[] args) {
        /* BÀI 6
        * Viết chương trình tách số và chữ từ chuỗi nhập vào, thành 2 chuỗi mới:
        * vd: nhập vào: assssda2123 --> 2 chuỗi: assssda và 2123
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào chuỗi cần tách:");
        String input = sc.nextLine();

        //Xử lý tách chuỗi.
        StringBuilder chuoi = new StringBuilder();
        StringBuilder so = new StringBuilder();

        // Duyệt chuỗi
        for ( int i = 0; i<input.length(); i++){
            char c = input.charAt(i);
            if (Character.isDigit(c)){
                so.append(c);
            } else if (Character.isLetter(c)) {
                chuoi.append(c);
            }
        }
        System.out.println("Chuỗi là: " +chuoi);
        System.out.println("Số là: " +so);

    }
}
