package CongTy;

public class test {
    public static void main(String[] args) {
        // Kiểu dữ liệu - tên biến  = ...
        /*NhanVien nv1 = new NhanVien("Nhân viên 1", "Hà Nội", 1234566);
        double luongnv1 =  nv1.tinhLuong();
        System.out.println("Lương NV1 là: " + luongnv1);*/

        //Tạo đối tượng là nhn viên hành chính
        NhanVienHanhChinh HC1 = new NhanVienHanhChinh("Nguyen Van Tuyen", "Ha Noi", 20139);
        double luongHC1 = HC1.tinhLuong();
        System.out.println("Lương cua Tuyen là: " + luongHC1);

        //Tạo đối tượng là nv đi ca
        NhanVienDiCa dc1 = new NhanVienDiCa("Hoang MeMe", "Phu Tho", 303001);
        double luongnvdc1 = dc1.tinhLuong();
        System.out.println("Lương cua MeMe là: " + luongnvdc1);

        NhanVienDiCa dc2 = new NhanVienDiCa("Hoang MeMe", "Phu Tho", 303001, 1);
        double luongnvdc2 = dc2.tinhLuong();
        System.out.println("Lương cua MeMe là: " + luongnvdc2);
        System.out.println(dc2.ca);
    }
}
