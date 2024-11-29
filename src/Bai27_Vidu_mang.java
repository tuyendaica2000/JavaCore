import java.util.Arrays;
import java.util.Scanner;

public class Bai27_Vidu_mang {
    public static void main(String[] args) {
        /*
        * Viết CT tạo 1 mảng 1 chiều gồm các phần tử là số nguyên có n phần tử, n nhập từ bàn phím.
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số phần tử tối đa của mang:");
        int n = sc.nextInt();

        //Tạo mảng có n phần tử (cấp phát bộ nhớ cho mảng)
        int[] M = new int[n];

        //nHẬP dữ liệu cho từng phần tử
        for (int i = 0; i<M.length; i++) {
            System.out.println("M[" +i+"]= ");
            M[i] = sc.nextInt();
        }

        //Xuất ra mảng:
        System.out.println("Mảng được tạo là:");
        System.out.println(Arrays.toString(M));
    }
}
