package Queue_AND_Deque;

import java.util.PriorityQueue;
import java.util.Queue;

public class Vidu_PriorityQueue {
    public static void main(String[] args) {
        // PriorityQueue: Khi đưa dữ liệu vào thì nó sẽ sắp xếp lại.
        Queue<String> danhSachSV = new PriorityQueue<>();

        // Thêm vào trong danhSachSV
        danhSachSV.offer("TITV 1");
        danhSachSV.offer("Pham Thi B");
        danhSachSV.offer("Pham Thi C");
        danhSachSV.offer("TITV 2");

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
