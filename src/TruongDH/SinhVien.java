package TruongDH;

public class SinhVien {
    //Thuộc tính giống với biến
    private String hoTen;
    private double diem;


    //Contructor mặc định (không có đối số):
    //Khởi tạo các giá trị mặc định ngay khi đối tượng vừa được tạo ra
    // tổ hợp phím: Alt+Insert để tạo ra Contructor
    public SinhVien() {
        hoTen = "No name";
        diem = 0.0;
    }


    //Contructor có đối số:
    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
    }
    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }


    // phương thức (các hàm)
    // phương thức không có kiểu trả về
    public void hienThiThongTin(){
        System.out.println(hoTen + " " +diem);
    }
    // Phương thức có kiểu trả về
    public double tinhDTB(double diemToan, double diemVan){
        return (diemToan + diemVan)/2;
    }

    // pt 2
    public double tinhDTB(double diemToan, double diemVan, double diemAnh){
        return (diemToan + diemVan + diemAnh)/3;
    }

    //Get-set
    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien: " +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem ;
    }



    /* Support Method && Service Method
       1. Support Method.
       Kiểm tra điểm khi nhập hồ sơ sinh viên
     */
    private boolean checkDiem() {
        return this.diem>=24;
    }

    // 2. Service Method: có thể gọi từ chương trình chính.(Không có kiểu trả về nên sẽ s dụng void)
    public void  checkHopLeDiem() {
        if (checkDiem()){
            System.out.println("Điểm hợp lệ, tiếp tục nhập thông tin");
        } else {
            System.out.println("Kiểm tra lại điểm đầu vào của sinh viên.");
        }
    }

    //Parametter List
    public double tongDiem (double ... arr){
        double tong = 0.0;
        for (double x : arr){
            tong += x;
        }
        return tong;
    }
}
