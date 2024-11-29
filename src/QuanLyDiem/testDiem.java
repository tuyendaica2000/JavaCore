package QuanLyDiem;

public class testDiem {
    public static void main(String[] args) {
        // Khởi tạo đối tượng khoa TOÁN
        KhoaToan toan1 = new KhoaToan("Nguyen Van Tuyen", "1001020139");
        toan1.tinhDTB();

        KhoaAnh anh1 = new KhoaAnh("Hoàng Me Me", "4544510111");
        anh1.tinhDTB();

        KhoaVan van1 = new KhoaVan("Kissinger","11012013295");
        van1.tinhDTB();
    }
}
