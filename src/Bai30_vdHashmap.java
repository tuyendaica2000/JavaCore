import java.util.HashMap;
import java.util.Scanner;

public class Bai30_vdHashmap {
    public static void main(String[] args) {
        /* Bài tập vd:
        * Viết ctrinh sử dụng Dict chứa 10 username và password.
        * CT yêu cầu nhập vào username và password.
        * 1. Nếu username không có trong dict, CT báo username không tồn tại.
        * 2. Nếu username đúng mà password sai thì báo: PASSWORD SAI.
        * 3. Nếu username - password đúng báo: Login thành công.
        * */
        HashMap<String, String> users = new HashMap<>();
        users.put("user1", "123456");
        users.put("user2", "123456");
        users.put("user3", "123456");
        users.put("user4", "123456");
        users.put("user5", "123456");
        users.put("user6", "123456");
        users.put("user7", "123456");
        users.put("user8", "123456");
        users.put("user9", "123456");
        users.put("user10","123456");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập username: ");
        String username = sc.nextLine();
        System.out.println("Nhập password: ");
        String password = sc.nextLine();
        //Kiểm tra
        if (!users.containsKey(username)){
            // Nếu không có key này trong hashmap thì đồng nghĩa username không tồn tại.
            System.out.println("Username không tồn tại.");
        } else if (!users.get(username).equals(password)) {
            // Sai mật khẩu
            System.out.println("PASSWORD SAI");
        }
        else {
            System.out.println("Bạn đã đăng nhập thành công.");
        }

    }
}
