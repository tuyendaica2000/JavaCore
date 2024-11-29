import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai27_BTTH_mang {
    public static void main(String[] args) {
        /* Bài tập tổng hợp.
        Viết CT tạo 1 mảng 1 chiều gồm các phần tử là số nguyên, có n phần tử nhẫu nhiên, n nhập từ bàn phím
        1. xuất các giá trị trong mảng.
        2. Đảo ngược mảng, xuất mảng sau khi đảo ngược.
        3. Sắp xếp mảng tăng dần.
        4. Tính tổng các phần tử trong mảng
        6. Cho người dùng nhập 1 số bất kì, kiểm tra số đó có tồn tại trong mảng không?
        Nếu có xuất ra vị trí index của số đó trong mảng.
        * */
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Mời bạn nhập vào số phần tử của mảng:");
        int n = sc.nextInt();

        //Tạo 1 mảng gồm n ptu
        int[] M = new int[n];
        //Tạo các pt ngẫu nhiên trong mảng
        for (int i = 0; i<M.length; i++) {
            int ngauNhien = rd.nextInt(16);
            M[i] = ngauNhien;
        }

        //1. Xuất các giá trị trong mảng.
        System.out.println("Mảng ngẫu nhiên vừa tạo ra là:");
        System.out.println(Arrays.toString(M));

        //2. Đảo ngược mảng và xuất ra sau khi đã đảo xong.
        for (int i = 0, j = M.length-1; i<j;i++, j--){
            int temp = M[i];
            M[i] = M[j];
            M[j] = temp;
        }
        //Xuất mảng sau khi đảo.
        System.out.println("Mảng sau khi đảo là:");
        System.out.println(Arrays.toString(M));

        //3. Sắp xếp mảng tăng dần
        Arrays.sort(M);
        System.out.println("Mảng sau khi đã sắp xếp theo thứ tự tăng dần là: ");
        System.out.println(Arrays.toString(M));

        //4. Tính tổng casc phần tử trong mảng
        int tong = 0;
        for (int pt : M) {
            tong+=pt;
        }
        System.out.println("Tổng các phần tử trong mảng là: " +tong);

        //5. Cho người dùng nhập 1 số bất kì, kiểm tra số đó có tồn tại trong mảng không?
        // Nếu có xuất ra vị trí index của số đó trong mảng.
        System.out.println("Mời bạn nhập vào số cần tìm: ");
        int so = sc.nextInt();
        boolean ktra = false;
        String viTri = "" ;
        for ( int i = 0; i<M.length ;i++){
            if (M[i]==so){
                ktra = true;
                viTri += (i+ ", ");
            }
        }
        if (ktra==true) {
            System.out.println(so +" có tồn tại trong mảng với vị trí index là: " +viTri);
        }
        else {
            System.out.println("Số: " +so +" không tồn tại trong mảng.");
        }
    }
}
