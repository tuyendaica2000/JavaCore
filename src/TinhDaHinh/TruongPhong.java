package TinhDaHinh;

public class TruongPhong extends NhanSu{
    public TruongPhong(String ten, String cccd, String queQuan) {
        super(ten, cccd, queQuan);
    }

    public TruongPhong(String cccd, String ten) {
        super(cccd, ten);
    }

    public TruongPhong() {
    }

    @Override
    public double tinhLuong(int ngayCong) {
        return 50 * ngayCong; // 50$/ngày công
    }
}
