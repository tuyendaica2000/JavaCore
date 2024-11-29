package TinhDaHinh;

public class TEST {
    public static void main(String[] args) {
        NhanSu ns1 = new PhoPhong("Nguyễn Văn Tuyến","10011151381","Hà Nội");
        // Xuất lương phó phòng
        System.out.println(ns1.tinhLuong(21));
        System.out.print("Lúc ns1 đang làm phó phòng: ");
        System.out.println(ns1.getTen()+" : "+ ns1.getCccd() + ", mức lương của ns1 khi đó là: "+ns1.tinhLuong(22) +"$");

        // Thay đổi chức vụ
        ns1 = new TruongPhong(ns1.getTen(), ns1.getCccd(),ns1.getQueQuan());
        //In ra ns1 khi làm trưởng phòng
        System.out.println(ns1.tinhLuong(21));
        System.out.print("Lúc ns1 đang làm trưởng phòng: ");
        System.out.println(ns1.getTen()+" : "+ ns1.getCccd() + ", mức lương của ns1 khi đó là: "+ns1.tinhLuong(22) +"$");

    }
}
