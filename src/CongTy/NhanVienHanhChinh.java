package CongTy;

public class NhanVienHanhChinh extends NhanVien{
    public NhanVienHanhChinh(String ten, String que, int cccd) {
        super(ten, que, cccd);
    }

    @Override //override: nghĩa là tái định nghĩa or ghi đè.
    public double tinhLuong() {
        return luongCoBan;
    }
}
