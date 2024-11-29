package oopSapXepClass;

import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        // Tạo list
        ArrayList<SanPham> ds = new ArrayList<>();
        //khoi tạo các đối tượng sản phẩm
        SanPham sp1 = new SanPham(1,"SamSung", 1000);
        SanPham sp2 = new SanPham(2,"Apple", 1050);
        SanPham sp3 = new SanPham(3,"Xiaomi", 899);
        //add sản phẩm vào list
        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);
        // xem danh sách sản phẩm trong list
        for (SanPham sp : ds){
            System.out.println(sp);
        }

        //Gọi PT sắp xếp:
        Collections.sort(ds);
        System.out.println("Danh sách sau sắp xếp là: ");
        for (SanPham sp : ds){
            System.out.println(sp);
        }
    }
}
