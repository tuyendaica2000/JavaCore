package CongTy;

public class NhanVienDiCa extends NhanVien{

    //Khai báo thêm thuộc tính ca
    // ca 1: làm ngày
    // ca 2: làm đêm
    protected int ca;

    public NhanVienDiCa(String ten, String que, int cccd) {
        super(ten, que, cccd);

    }
    //TẠO RA 1 CONTRUCTER TƯƠNG TỰ<TRÁNH BỊ BÁO LỖI ĐỎ Ở test>
    public NhanVienDiCa(String ten, String que, int cccd, int ca) {
        super(ten, que, cccd);
        this.ca = ca;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan*1.05; //Cao hơn 5% so với NV Hành chính
    }
}
