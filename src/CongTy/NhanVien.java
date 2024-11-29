package CongTy;

public abstract class NhanVien {
    // Để protected để có thể kế thừa dc, để private thì sẽ k thể kế thừa dc
    //1. Thuộc tính.
    protected String ten ;
    protected String que ;
    protected int cccd ;
    protected double luongCoBan = 850 ;

    //Contructer: ALL + insert
    //2. Hàm tạo
    public NhanVien(String ten, String que, int cccd) {
        this.ten = ten;
        this.que = que;
        this.cccd = cccd;
    }

    //Phương thức tính lương
    //3. Phương thức.
    public abstract double tinhLuong() ;
}
