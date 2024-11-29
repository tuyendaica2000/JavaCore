package Enum;

import java.util.ArrayList;

public class TestEnum {
    public static void main(String[] args) {
        // kiểm tra thứ tự các giá trị trong Enum
        System.out.println(XepLoai.kha.ordinal());
        System.out.println(XepLoai.yeu.ordinal());

        //Tạo list danh sách để test
        ArrayList<SV> ds = new ArrayList<>();
        //Tạo đối tượng sv
        SV sv1 = new SV(1, "Nguyen van 1", 9.8);
        SV sv2 = new SV(2, "Nguyen van 2", 3.8);
        SV sv3 = new SV(3, "Nguyen van 3", 6.8);
        //add sinh viên vào ds list
        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);
        // duyệt danh sách
        for (SV ttSinhVien: ds) {
            System.out.println(ttSinhVien);
        }
    }
}
