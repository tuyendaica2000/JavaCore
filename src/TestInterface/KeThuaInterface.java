package TestInterface;

public class KeThuaInterface implements Vidu_Interface{
    @Override
    public void thongTin(String ten, String cccd, int namSinh) {

    }

    @Override
    public double tinhLuong(double luongNgay, int soNgayCong) {
        return luongNgay*soNgayCong;
    }
}
