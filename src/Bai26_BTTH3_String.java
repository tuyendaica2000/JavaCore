import java.util.Scanner;

public class Bai26_BTTH3_String {
    public static void main(String[] args) {
        /* BÀI 3
        * Viết chương trình chuyền tin nhắn sang mật mã theo bảng
        * a="assadasdasoooooaisida"
        * b="zxmxmnvnosiyqiajsh"
        * */
        //Tạo bảng mã hóa
        String a = "asdfghjklqwertyuiop";
        String b = "zxcvbnmqwertyuiopsa";
        //Yêu cầu người dùng nhập mã hóa từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào tin nhắn cần mã hóa: ");
        String input = sc.nextLine();

        //Khai báo 1 biến lưu tin nhắn sau khi được mã hóa.
        String output = "";
        for ( int i = 0;i<input.length();i++) {
            char c = input.charAt(i);
            //Tìm vị trí của ký tự trong biến a
            int index =a.indexOf(c);
            //Nếu ký tự này không nằm trong biến a thì k cần mã hóa và thêm nó vào output ngay lập tức.
            if(index == -1) {
                output+=c;
            }
            else {
                output+=b.charAt(index);
            }
        }
        System.out.println("Tin nhắn sau mã hóa là: " +output);
    }
}
