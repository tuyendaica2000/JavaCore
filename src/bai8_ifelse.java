import java.util.Scanner;

public class bai8_ifelse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*System.out.println("Mời nhập vào điểm trung bình: ");
        double dtb = sc.nextDouble();
        // kiểm tra điều kiện
        if (dtb>8.0 && dtb<10) {
            System.out.println("Ban xep loai: GIOI");
        }
        else if(dtb >=7 && dtb<8){
            System.out.println("Ban xep loai: KHA");
        } else if (dtb >=5 && dtb<7) {
            System.out.println("Ban xep loai: Trung Binh");
        } else if(dtb>=3 && dtb<5) {
            System.out.println("Ban xep loai: Yeu");
        } else {
            System.out.println("Ban xep loai: Kem");
        }*/

        /*//Bài tập: PT: x+y=14 && x-y=4
        System.out.println("Nhap vao tong 2 so: ");
        double tong = sc.nextDouble();
        System.out.println("Nhap vao hieu 2 so: ");
        double hieu = sc.nextDouble();

        double a =(tong + hieu)/2;
        double b =tong - a;

        System.out.println("Ket qua nhan duoc a= "+a);
        System.out.println("Ket qua nhan duoc b= "+b);*/

        /*// Bai tap: nhap vao chieu cao, can nang de tinh BMI va xuat ra thong bao.
        System.out.println("Nhập đầy đủ họ tên của bạn: ");
        String hoten = new Scanner(System.in).nextLine();
        System.out.println("Nhập chiều cao của bạn: ");
        double chieucao = sc.nextDouble();
        System.out.println("Nhập cân nặng của bạn: ");
        double cannang = sc.nextDouble();
        // Tinh BMI:can nang / chieu cao^2
        double BMI = cannang / Math.pow(chieucao,2);
        if (BMI<15){
            System.out.println("Qua đánh giá chỉ số BMI thì thân hình của bạn: QUÁ GẦY_" +BMI);
        } else if (BMI>=15 && BMI<16) {
            System.out.println("Qua đánh giá chỉ số BMI thì thân hình của bạn: GẦY_"+BMI);
        } else if (BMI>=16 && BMI<18.5) {
            System.out.println("Qua đánh giá chỉ số BMI thì thân hình của bạn: HƠI GẦY_"+BMI);
        } else if (BMI>=18.5 && BMI<25) {
            System.out.println("Qua đánh giá chỉ số BMI thì thân hình của bạn: BÌNH THƯỜNG_"+BMI);
        } else if (BMI>=25 && BMI<30) {
            System.out.println("Qua đánh giá chỉ số BMI thì thân hình của bạn: HƠI BÉO_"+BMI);
        } else if (BMI>=30 && BMI<35 ) {
            System.out.println("Qua đánh giá chỉ số BMI thì thân hình của bạn: BÉO_"+BMI);
        } else if (BMI >35) {
            System.out.println("Qua đánh giá chỉ số BMI thì thân hình của bạn: QUÁ BÉO_"+BMI);
        }*/

        // Bài tập tính năm nhuận
        System.out.println(" Nhập năm cần tính: ");
        int nam = sc.nextInt();
        if ((nam %4==0 && nam %100!=0) || (nam%400==0)) {
            System.out.println("Năm: " +nam + " Là năm nhuận.");
        } else {
            System.out.println("Năm:" +nam +" Không phải là năm nhuận.");
        }

        // Bài tập xem tháng có bao nhiêu ngày
        /*System.out.println(" Nhập tháng bạn muốn biết có bao nhiêu ngày: ");
        int thang = sc.nextInt();
        if (thang==1 || thang==3 || thang==5 || thang==7 || thang==8 || thang==10 || thang==12 ){
            System.out.println("Tháng: "+thang + "có 31 ngày.");
        } else if (thang==4 || thang==6 || thang==9 || thang==11 ) {
            System.out.println("Tháng: "+thang + "có 30 ngày.");
        } else if (thang==2) {
            System.out.println("Nhập năm: ");
            int nam = sc.nextInt();
            if ((nam%4==0 && nam%100==0) || (nam%400==0)){
                System.out.println("Tháng "+thang +" năm "+nam +" có 29 ngày.");
            } else {
                System.out.println("Tháng "+thang +" năm "+nam +" có 28 ngày.");
            }
        } else {
            System.out.println("Bạn nhập tháng linh tinh.");
        }*/

        /*//Bài tập giải phương trình: ax2 + bx + c = 0
        System.out.println("Nhập vào các hệ số:a, b, c để giải phương trình: ax2 + bx + c = 0");
        System.out.println("Nhập vào hệ số a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập vào hệ số b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập vào hệ số c: ");
        double c = sc.nextDouble();
        double delta = Math.pow(b,2) - (4*a*c);
        System.out.println("Ta có, delta= "+delta);
        //Kiểm tra điều kiện:
        if (delta<0){
            System.out.println("phương trình vô nghiệm.");
        } else if (delta == 0) {
            double x = -b/(2*a);
            System.out.println("Phương trình có 1 nghiệm duy nhất: x1=x2= " +x);
        }
        else {
            System.out.println("Phương trình có 2 nghiệm phân biệt: ");
            double x1 = -b+(Math.sqrt(delta))/2*a;
            double x2 = -b-(Math.sqrt(delta))/2*a;
            System.out.println("Phương trình có nghiệm: x1= "+x1);
            System.out.println("Phương trình có nghiệm: x2= "+x2);
        }*/

        // Bài tập: nhập tháng để biết tháng đó thuộc quý mấy trong năm
//        System.out.println("Mời bạn nhập tháng cần tìm: ");
//        int thang = sc.nextInt();
//        if (thang==1 || thang==2 || thang==3 ){
//            System.out.println("Tháng: " +thang +" thuộc quý I trong năm.");
//        } else if (thang==4 || thang==5 || thang==6 ){
//            System.out.println("Tháng: " +thang +" thuộc quý II trong năm.");
//        } else if (thang==7 || thang==8 || thang==9 ){
//            System.out.println("Tháng: " +thang +" thuộc quý III trong năm.");
//        }
//        else if (thang==10 || thang==11 || thang==12 ){
//            System.out.println("Tháng: " +thang +" thuộc quý VI trong năm.");
//        }
//        else {
//            System.out.println(" Bạn nhập tháng linh tinh vớ vẩn !!!");
//        }
    }
}
