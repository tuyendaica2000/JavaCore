import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class bai28_ArraysList {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        // Khai báo số lượng pt
        ArrayList<Integer> lst2 = new ArrayList<>(5);

        // Khởi tạo list với các pt ban đầu
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1,2,3,4,5,6));

        // xuất list
        System.out.println(lst3);
        System.out.println(lst2);
        System.out.println(lst);

        //1. Add thêm phần tử.
        ArrayList<Integer> lst4 = new ArrayList<>();
        //add pt
        lst4.add(7);
        lst4.add(8);
        lst4.add(11);
        System.out.println("lst4 mới add là:");
        System.out.println(lst4);
        //add (index,element) vào vị trí chỉ định:
        lst4.add(1,69);
        System.out.println("lst4 mới add thêm vào vị trí 1 là:");
        System.out.println(lst4);
        System.out.println();


        //2. Size: Trả về số phần tử
        System.out.println("Số pt của lst4 là: " + lst4.size());
        System.out.println();


        //3. get(int index): trả về giá trị list tại vị trí index.
        System.out.println("" +lst4.get(3));
        System.out.println();


        //4. remove: xóa 1 pt nào đó tại vị trí index
        System.out.println("Xóa: " +lst4.remove(2));
        System.out.println(lst4);
        ArrayList<Integer> lst5 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("Mảng mới lst5: "+lst5);
        lst5.remove(Integer.valueOf(5));
        System.out.println("Mảng lst5 sau khi xóa: " +lst5);
        System.out.println();

        //5. set: thay đổi thông tin theo vị trí index
        ArrayList<Integer> lst6 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("lst6= " +lst6);
        lst6.set(3,444);
        System.out.println("lst6 sau khi sửa:" +lst6);

        //6. Contains(): Kiểm tra Collection có chứa phần tử nào đó hay không.
        ArrayList<Integer> lst7 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        boolean kiemtra = lst7.contains(16);
        System.out.println(kiemtra);

        //7. Collections.sort(list): sắp xếp tăng dần.
        ArrayList<Integer> lst8 = new ArrayList<>(List.of(100,29,30000,410,51,60,1,810,9,10));
        Collections.sort(lst8);
        System.out.println("List sau sắp xếp là: "+lst8);

        //8. indexOf():Tìm vị trí đầu tiên của element trong list
        //Nếu không tồn tại nó sẽ trả về -1
        ArrayList<Integer> lst9 = new ArrayList<>(List.of(100,29,30000,410,51,60,1,810,9,10,9));
        System.out.print("Nếu có giá trị cần nhập thì trả về kq TRUE= q1 và FALSE= -1. Kết quả = ");
        System.out.println(lst9.indexOf(9));

        // Duyệt list
        //Cách 1:
        ArrayList<Integer> lst10 = new ArrayList<>(List.of(100,29,30000,410,51,60,1,810,9,10,9));
        System.out.println("lst10 dùng duyệt for");
        for (int vl : lst10) {
            System.out.println(vl);
        }

        System.out.println("=-------------------=");
        //Cách 2: Khi cần sử dụng đến các chỉ số index
        ArrayList<Integer> lst11 = new ArrayList<>(List.of(1,2,3,4,5,6));
        for (int i = 0; i<lst11.size();i++) {
            int vl = lst11.get(i);
            System.out.println(vl);
        }
    }
}
