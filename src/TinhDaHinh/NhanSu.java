package TinhDaHinh;

public abstract class NhanSu {
    // Thêm các thuộc tính
    private String ten;
    private String cccd;
    private String queQuan;

    //Tạo contructer: alt+insert
    public NhanSu(String ten, String cccd, String queQuan) {
        this.ten = ten;
        this.cccd = cccd;
        this.queQuan = queQuan;
    }

    public NhanSu(String cccd, String ten) {
        this.cccd = cccd;
        this.ten = ten;
    }

    public NhanSu() {
    }

    // Khai báo 1 phương thức: Phương thức tính lương
    public abstract double tinhLuong(int ngayCong);

    //Getter để xem thông tin khi bên trên đã để private
    public String getTen() {
        return ten;
    }

    public String getCccd() {
        return cccd;
    }

    public String getQueQuan() {
        return queQuan;
    }
}
