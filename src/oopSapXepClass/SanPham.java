package oopSapXepClass;

public class SanPham implements Comparable<SanPham>{
    //Thuộc tính: Mức độ truy xuất --> kiểu dữ liệu --> tên thuộc tính.
    private int ma;
    private String ten;
    private double gia;
    //Contructer: alt+insert


    public SanPham(int ma, String ten, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    //Get, set: Xem và sửa thông tin thuộc tính
    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public double getGia() {
        return gia;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    //toString

    @Override
    public String toString() {
        return "Sản phẩm: {" +
                "mã=" +  ma +
                ", tên='" + ten + '\'' +
                ", giá= " + gia +
                '}';
    }

    @Override
    public int compareTo(SanPham o) {
        return this.ten.compareToIgnoreCase(o.ten);
    }

    // Phương thức

    //Sắp xếp theo giá
    /*@Override
    public int compareTo(SanPham o) {
        if (this.gia<o.gia){
            return -1;
        }
        if (this.gia>o.gia) {
            return 1;
        }
        return 0;
    }*/
}
