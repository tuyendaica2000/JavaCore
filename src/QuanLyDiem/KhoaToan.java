package QuanLyDiem;

public class KhoaToan extends NamHoc2024{
    public KhoaToan(String ten, String cccd) {
        super(ten, cccd);
    }
    //Override
    @Override
    public void tinhDTB() {
        System.out.println("Đây là phương thức tính điểm trung bình của khoa TOÁN: ");
    }
}
