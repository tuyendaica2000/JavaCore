package Enum;

public class SV {
    //Khởi tạo thuộc tính
    private int ma;
    private String ten;
    private  double diemtb;
    private XepLoai loai;

    //Contructer
    public SV(int ma, String ten, double diemtb) {
        this.ma = ma;
        this.ten = ten;
        this.diemtb = diemtb;
        this.loai = getLoai();
    }

    //Phương thức để getloai
    public XepLoai getLoai() {
        if (this.diemtb>=8) {
            loai=XepLoai.gioi;
        } else if (this.diemtb>=6.5) {
            loai=XepLoai.kha;
        }else if (this.diemtb>=5.0) {
            loai=XepLoai.trungbinh;
        }else if (this.diemtb>=3.0) {
            loai=XepLoai.yeu;
        }
        else {
            loai=XepLoai.duoihoc;
        }
        return loai;
    }

    // toString để xuất thông tin của đối tượng ra

    @Override
    public String toString() {
        return ma + "\t" + ten+"\t"+this.loai;
    }
}
