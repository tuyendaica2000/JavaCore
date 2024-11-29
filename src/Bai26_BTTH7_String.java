import java.util.Scanner;

public class Bai26_BTTH7_String {
    public static void main(String[] args) {
        /* BÀI 7
        * Viết CT kiểm tra 1 chuỗi nhập vào từ bàn phím có phải Panlyndrome
        * (Là chuỗi có đảo ngược cũng bằng chính nó)
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String str = sc.nextLine();
        String chuoiDao = new StringBuilder(str).reverse().toString();
        //So sánh chuỗi đảo với chuỗi ban đầu xem có giống nhau không, nếu giống là Panlyndrome.
        if (str.equalsIgnoreCase(chuoiDao)){
            System.out.println("Đây là Panlyndrome.");
        }
        else {
            System.out.println("Đây không phải là chuỗi Panlyndrome");
        }
    }
}
