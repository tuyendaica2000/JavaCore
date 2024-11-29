import java.util.*;

public class Bai29_BTTH_ArraysList {
    public static void main(String[] args) {
        //Bài 1:
        /*
        * Viết CT tạo ra 1 list có n phần tử, n nhập từ bàn phím.
        * Các phần tử là số ngẫu nhiên từ (1,100)
        * */

        /*Scanner sc = new Scanner(System.in);
        //Hỏi người dùng nhập vào số lượng pt cần tạo.
        System.out.println("Mời bạn nhập số phần tử: ");
        int n = sc.nextInt();
        //Tạo 1 đối tượng Random
        Random rd = new Random();
        //Tạo 1 danh sách (kiểu dl là số nguyên)
        ArrayList<Integer> lst = new ArrayList<>();
        //Tạo các phần tử ngẫu nhiên và thêm vào danh sách
        for (int i = 0; i<n; i++){
            int ngauNhien = rd.nextInt(1,101);
            lst.add(ngauNhien);
        }
        //In ra danh sách.
        System.out.println(lst);*/


        //Bài 2:
        /*
        * Viết CT nhập vo 1 danh sách list sau đó:
        * 1. Tạo ra 1 list mới bình phương các phần tử
        * 2. Xác định bao nhiêu phần tử lớn hơn 50
        * */

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào list: ");
        int n = sc.nextInt();
        //Cho người dùng nhập pt
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<n;i++) {
            System.out.println("Mời nhập vào số pt: " +(i+1));
            int soNhap = sc.nextInt();
            list.add(soNhap);
        }
        System.out.println(list);

        //Bình phương
        ArrayList<Integer> binhPhuong = new ArrayList<>();
        for (int x : list) {
            binhPhuong.add(x*x);
        }
        System.out.println("Danh sách mới sau khi bình phương là:");
        System.out.println(binhPhuong);

        //Xác định có bnhieu pt >50
        int count = 0;
        for (int y : binhPhuong){
            if (y<=0){
                System.out.println("Không có phần tử nào");
            }
            else if (y>50){
                count++;
            }
        }
        System.out.println("Số lượng pt lớn hơn 50 có: " +count + " phần tử.");*/


        /* Bài 3
        * Viết CT trả lời các kết quả của các phép tính.
        * */

        /*Scanner sc = new Scanner(System.in);
        ArrayList<String> quest = new ArrayList<>(List.of(
                "2+5+7= ",
                "5*10= ",
                "sqrt(16)",
                "12%2"
        ));

        //List đáp án
        ArrayList<Float> traLoi = new ArrayList<>(List.of(14f,50f,4f,0f)); //kiểu Float phải có chứ f đằng sau
        //Duyệt list câu hỏi:
        for (int i = 0; i<quest.size();i++) {
            System.out.println(quest.get(i));
            //Nhập kết quả
            System.out.println("Nhap ket qua: ");
            Float kq = sc.nextFloat();
            //ktra voi dap an
            if (kq.equals(traLoi.get(i))){
                System.out.println("Dap an da dung! Xin chuc mung ban da tinh rat tot.");
            }
            else
                System.out.println("Tinh toan sai roi ma oi~~~. Dap an la: "+traLoi.get(i));
            System.out.println(" ");
        }*/

        /* Bài 4
        * Viết chương trình nhập vào 1 list có n ptu ngẫu nhiên,các ptu là số nguyên, n nhập từ bphim
        * 1. In ra có bao nhiêu số nhỏ hơn 80
        * 2. In ra vị trí index của các số đó.
        * */

        /*Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Mời bạn nhập vào list:");
        int n = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();

        //Tạo ra các ptu ngẫu nhiên
        for (int i = 0; i < n;i++){
            int ngauNhien = rd.nextInt(300);
            lst.add(ngauNhien);
        }
        System.out.println(lst);

        //lấy số <80 + xuất ra vị trí
        int count = 0;
        String viTri = "";
        for (int i = 0; i<lst.size();i++){
            if (lst.get(i)<80){
                count++;
                viTri += i+ " ";
            }
        }
        if (count==0) {
            System.out.println("Không có số nào <80 trong list");
        }
        else {
            System.out.println("Số lượng số nhỏ hơn trong list là: " +count);
            System.out.println("Vị trí của số <80 là: " +viTri);
        }*/

        /* Bài 5
        * Cho list: lst={1,3,5,6,8,9,4,14,27,8}
        * Viết CT in ra số lướng t2 và số nhỏ t2 trong list.
        * In ra index vị trí của các số đó.
        * */

        ArrayList<Integer> lst = new ArrayList<>(List.of(1,3,5,9,4,14,27,8));
        //Tạo ra 1 list mới có giá trị giống với list cũ để sắp xếp tăng dần và lấy ra vị trí.
        ArrayList<Integer> copy = new ArrayList<>(lst);

        //Sắp xếp theo thứ tự tăng dần
        Collections.sort(copy);
        System.out.println("Sau sắp xếp: "+copy);

        //In ra số lớn t2 và nhỏ t2 trong list
        int soLont2 = copy.get(copy.size()-2);
        int soNhot2 = copy.get(1);
        System.out.println("Số LỚN t2 trong list là: "+soLont2);
        System.out.println("Số NHỎ t2 trong list là: "+soNhot2);

        System.out.println("Vị trí của số LỚN t2 là: " +lst.indexOf(soLont2));
        System.out.println("Vị trí của số NHỎ t2 là: " +lst.indexOf(soNhot2));
    }

}
