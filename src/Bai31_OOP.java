import TruongDH.SinhVien;

public class Bai31_OOP {
    public static void main(String[] args) {
        // Khởi tạo đối tượng thuộc class TruongDH.SinhVien
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien("TuyenTieu");
        sv3.hienThiThongTin();
        SinhVien sv4 = new SinhVien("NVT", 8.9);
        sv4.hienThiThongTin();
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());

        sv4.setHoTen("Black");
        sv4.setDiem(25);
        sv4.hienThiThongTin();

        //Test phương thức có kiểu trả về
        double diemTBsv4 = sv4.tinhDTB(7.5 , 9.0 );
        System.out.println(diemTBsv4);

        //Test phương thức toString
        System.out.println(sv4);

        //Support Method && Service Method.
        sv4.checkHopLeDiem();

        //Overloading
        double testDiem = sv4.tinhDTB(5,6,7);
        System.out.println(testDiem);

        double kq = sv4.tongDiem(1,2,3,4,5,6,9.9,10);
        double kq2 = sv4.tongDiem(1,2,3,4,5,6,9.9,10,55,1153,16,12.091);
        System.out.println(kq);
        System.out.println(kq2);
    }
}
