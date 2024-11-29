package TinhDaHinh;

public class PhoPhong extends NhanSu{
    public PhoPhong(String ten, String cccd, String queQuan) {
        super(ten, cccd, queQuan);
    }

    public PhoPhong(String cccd, String ten) {
        super(cccd, ten);
    }

    public PhoPhong() {
    }

    @Override
    public double tinhLuong(int ngayCong) {
        return 40 * ngayCong; // 40$/ngày công
    }
}
