import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class bai15_baitapTONGHOP {
//    public static void main(String[] args) {
//        //Bai1: Nhập vào số nguyeen n, in ra kết quả.
//        //for
//        /*Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào số nguyên n= ");
//        int n = sc.nextInt();
//        int gt = 1;
//        for (int i=1; i<=n;i++){
//            gt= gt * i;
//            System.out.println(gt);
//        }*/
//
//        //while
//        /*int n;
//        int i=1;
//        int gt = 1;
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Nhap n giai thua.");
//        n = sc.nextInt();
//        while ( i<=n){
//            gt= gt*i;
//            i++;
//        }
//        System.out.println(+n + "! =" +gt);*/
//
//
//        //BT: Viết chương trình nhập số a từ bàn phím. Nếu a chẵn tính tổng từ 0-a. Nếu a lẻ đưa ra tbao và thoát ctrinh.
//        /*Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số a= ");
//        int a = sc.nextInt();
//
//        int tong = 0;
//        if (a%2 !=0){
//            System.out.println("Tôi không tính số lẻ, cảm ơn.");
//        }
//        else {
//            for (int x = 0; x<=a; x+=2){
//                tong+=x;
//            }
//            System.out.println("Tổng các số chẵn từ 0 cho đến " +a + " = " +tong);
//        }*/
//
//
//        //BT: Viết ctrinh tính tổng các số lẻ từ 1 đến n, n nhập từ bàn phím.
//        // Nhập n = 7, bỏ qua cộng tổng với số 3 --> in ra kết quả
//        // Thử Break khi vòng lặp chạy đến giá trị n=3.
//
//        /*Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số n= ");
//        int n = sc.nextInt();
//        int tong = 0;
//        if (n%2 !=0){
//            for (int i = 1; i<=n; i+=2){
//                if (i==3){
//                    continue;
//                }
//                System.out.println(i);
//                tong+=i;
//            }
//            System.out.println("Tổng các số lẻ từ 1 tới n=" +n +" = "+tong);
//        }
//        else {
//            System.out.println("Đây không phải là số lẻ.");
//        }*/
//
//
//        //BT: Tìm các số chia hết cho 3 bắt đầu từ 10-50.
//        /*for (int i = 10; i<=50; i++){
//            if (i%3==0){
//                System.out.print(+i +" ");
//            }
//        }*/
//
//        //BT: Viết ctrinh tính tổng S= 1! + 2! + 3! + ... + 10!
//        /*int gt = 1;
//        int tong = 0;
//        for (int i = 1; i<=10; i++){
//            gt*=i;
//            tong+=gt;
//        }
//        System.out.println("Tong giai thua= " +tong);*/
//
//        //Tìm số hoàn hảo từ 1-1000
//        /*int n = 1000;
//        int tong = 0;
//        for (int i = 1; i<n; i++){
//            if (n%i==0){
//                tong+=i;
//                System.out.println(+i);
//            }
//        }
//        if (tong==n){
//            System.out.println(+n +" là số hoàn hảo");
//        }
//        else {
//            System.out.println(+n +" không là số hoàn hảo");
//        }*/
//
//        /*for (int n = 1; n<=1000; n++){
//            int tong=0;
//            for (int i = 1; i<n;i++){
//                if (n%i==0){
//                    tong+=i;
//                }
//            }
//            if (tong==n){
//                System.out.println(+n +" là số hoàn hảo");
//            }
//        }*/
//
//
//        //BT: Viết chươn trình nhập số nguyên tố a>0 từ bàn phím. Và cho biết đó có phải là số nguyên tố không?
//        // Kết thusc chương trình hỏi người dùng: Bạn có muốn tiếp tục sử dụng phần mềm không?
//        // Nếu chọn không thì thoát chương trình
//        /*int a;
//        Scanner sc = new Scanner(System.in);
//        while (true){
//            System.out.println("Nhập số nguyên a>0: ");
//            a = sc.nextInt();
//            // Check điều kiện đảm bảo người dùng nhập a>0
//            while (a<=0){
//                System.out.println("Nhập lại a, a phai >0");
//                a = sc.nextInt();
//            }
//            System.out.println("Bạn đã nhập a thành công: " +a);
//            int demUoc = 0;
//            for (int i = 1; i<a;i++){
//                if (a%i==0){
//                    demUoc++;
//                }
//            }
//            if (demUoc==2){
//                System.out.println(a +"là số nguyên tố");
//            }else {
//                System.out.println(a+ "không phải là số nguyên tố.");
//            }
//            System.out.println("Bạn có muốn thoát khỏi chương trình hay không? Bấm: Y để thoát");
//            String traLoi= new Scanner(System.in).nextLine();
//            if (traLoi.equals("y") || traLoi.equals("Y")){
//                break;
//            }*/
//
//
//
//    }
public static boolean isLeapYear(int year) {
    // Năm nhuận là năm chia hết cho 4, trừ khi nó chia hết cho 100 nhưng không chia hết cho 400
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}

    public static void main(String[] args) {
        // Nhập vào ngày tháng năm sinh (Ví dụ: ngày sinh là 03/03/2001)
        String birthDateStr = "16/02/2001";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(birthDateStr, formatter);

        // Tính ngày thứ 10,000 từ ngày sinh
        LocalDate targetDate = birthDate.plusDays(10000);

        // Hiển thị ngày thứ 10,000
        System.out.println("Ngày thứ 10.000 kể từ ngày sinh (" + birthDateStr + ") là ngày: " + targetDate);

        // Kiểm tra và hiển thị các năm nhuận từ năm sinh đến năm của ngày thứ 10,000
        System.out.println("\nCác năm nhuận từ " + birthDate.getYear() + " đến " + targetDate.getYear() + ":");
        for (int year = birthDate.getYear(); year <= targetDate.getYear(); year++) {
            if (isLeapYear(year)) {
                System.out.println(year + " là năm nhuận.");
            }
        }
    }
}
