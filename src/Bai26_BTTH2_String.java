import java.util.Scanner;

public class Bai26_BTTH2_String {
    public static void main(String[] args) {
        /* BAI 2
         * Viết chương trình kiểm tra tính hợp lệ của mật khẩu: aaaaaAAAAAA1
         * Mật khẩu hợp lệ khi có ít nhất 6 kí tự.
         * Chứa ít nhất 1 chữ cái (Thường hoặc HOA đều được)
         * Chứa ít nhất 1 chữ số.
         * Cho người dùng nhập vào mật khâu để login/so sánh, nếu đúng mở cửa, sai quá 5 lần khóa đăng nhập, thoát CT.
         * */

        Scanner sc = new Scanner(System.in);
        String password = "";
        //Mời thiết lập mật khẩu và kiểm tra tính hợp lệ.
                while (true) {
                    // nhap mk mới cho người dùng
                    System.out.println("Mời thiết lập mật khẩu");
                    System.out.println("Mật khẩu ít nhất có 6 ký tự, ít nhất 1 chữ cái và 1 chữ số:");
                    String newPassword = sc.nextLine();
                    //Kiểm tra tính hợp lệ của mật khẩu
                    if (checkmk(newPassword)) {
                        password = newPassword;
                        System.out.println("Mật khẩu mới đã được thiết lập.");
                        break;
                    }
                    else {
                        System.out.println("Mật khẩu không hợp lệ.");
                    }
                }

                //2. Cho người dùng nhập mk để login. Nhập sai quá 5 lần thoát CT
                int count = 0 ;
                String login = "";
                while (true) {
                    System.out.println("Mời nhập mk để login:");
                    login = sc.nextLine();
                    //Kiểm tra mk có khớp không
                    if (login.equals(password)){
                        System.out.println("Đăng nhập thành công!");
                        break;
                    }
                    else {
                        System.out.println("MK không đúng, vui lòng nhập lại. Bạn còn: "+(4-count)+" lần thử.");
                        count++;
                    }
                    //Nếu biến đếm =5 thì thoát CT
                    if (count==5){
                        System.out.println("Bạn đã nhập sai quá 5 lần. Bạn đã bị khóa.");
                        break;
                    }
                }
            }
                //Với những dạng bài kiểm tra tính hợp lệ, ta tạo thêm 1 hàm
                // Hàm kiểm tra tính hợp lệ của mật khẩu
                public static boolean checkmk(String password){
                    // Kiểm tra độ dài
                    if (password.length()<6){
                        return  false;
                    }

                    //Mật khẩu hợp lệ khi có ít nhất 6 kí tự
                    boolean hasLetter = false;
                    for ( char c : password.toCharArray()) {
                        if (Character.isLetter(c)){
                            hasLetter=true;
                            break;
                        }
                    }
                    if (!hasLetter){
                        return false;
                    }

                    // Chứa ít nhất 1 chữ số
                    boolean hasNumber = false;
                    for ( char c : password.toCharArray()) {
                        if (Character.isDigit(c)){
                            hasNumber=true;
                            break;
                        }
                    }
                    if (!hasLetter) {
                        return  false;
                    }
                    // Nếu MK đủ độ dài, chứa ít nhất 1 chữ cái và 1 chữ số thì trả về true.
                    return true;
                }

    }

