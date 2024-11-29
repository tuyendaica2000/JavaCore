package Queue_AND_Deque;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new LinkedList<>();
            // Queue thông thường thì ta sẽ sử dụng LinkedList.
        // LinkedList là 1 class trong Java mà nó implement cả List và implement cả Queue nhưng nó thường được
        // sử dụng cho Queue nhiều hơn.

        // Thêm vào trong danhSachSV
        danhSachSV.offer("Nguyen Van A");
        danhSachSV.offer("Le Van B");
        danhSachSV.offer("Pham Thi C");
        danhSachSV.offer("Tran Trong D");

        // In ra và xóa nó luôn
        while (true) {
            String  ten = danhSachSV.poll(); //peek: lấy ra nhưng k xóa.
            if (ten == null){
                break;
            }
            //peek lấy ra và xóa luôn
            System.out.println(ten);

        }
    }
}
