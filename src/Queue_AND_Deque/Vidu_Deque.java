package Queue_AND_Deque;

import java.util.*;

public class Vidu_Deque {
    public static void main(String[] args) {
        Deque<String> danhSachSV = new ArrayDeque<>();
            // ArrayDeque là class mà thường xuyên sử dụng với Deque. Deque nó là hàng đợi có 2 đầu khác với
        // Queue là nó có hàng đợi 1 đầu.


        danhSachSV.offer("TITV 1");
        danhSachSV.offer("Nguyen Van A");
        danhSachSV.offer("Nguyen Van B");
        danhSachSV.offer("TITV 2");
        danhSachSV.offerLast("TITV 3");
        danhSachSV.offerFirst("TITV 0");

        while (true) {
            String ten = danhSachSV.poll();
            if (ten == null) {
                break;
            }
            System.out.println(ten);
        }
    }
}
