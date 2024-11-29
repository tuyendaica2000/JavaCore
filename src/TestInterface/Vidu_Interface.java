package TestInterface;

public interface Vidu_Interface {
    // Tập các thuộc tính chỉ được phép là hằng số.
    static final double phuCap = 15;
    // Các phương thức <phải là trừu tượng: chỉ có phần đầu chứ k có phần thân>
    public abstract void thongTin(String ten, String cccd, int namSinh);
    public abstract double tinhLuong(double luongNgay, int soNgayCong);

}
