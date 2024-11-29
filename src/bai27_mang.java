import java.util.Arrays;

public class bai27_mang {
    public static void main(String[] args) {
        //1. Khai báo mảng:
        String[] mangStr ;
        float[] mangFl;
        double[] mangdb;

        //2. Khởi tạo mảng kèm theo kích thước
        String[] mangStr2 = new String[16]; // chứa tối đa 16 phần từ
        int[] mangNguyen = new int[69];

        //3. Khởi tạo mảng kèm giá trị ban đầu.
        String[] mangStr3 = new String[] {"Họ và tên: ", "Nguyễn Văn Tuyến"};
        int[] mangNguyen2 = new int[] {1,2,3,4,5,6};

        //4. Truy xut phần tử của mảng dựa theo index
        System.out.println(mangNguyen2[5]);

        //5. Length
        System.out.println(mangNguyen2.length);

        //6. Duyệt mảng dùng for
        // CÁCH 1:
        int[] mang4 = new int[]{1,2,4,5,6,7,8,11};
        for (int pt : mang4) {
            System.out.println(pt);
        }
        String[] mang5 = new String[] {"Họ và tên: ", "Nguyễn Văn Tuyến"};
        for (String pt2 : mang5) {
            System.out.print(pt2);
        }
        System.out.println();
        // CÁCH 2:
        for (int i = 0; i<mang4.length; i++){
            System.out.println(mang4[i]);
        }
        String[] mang6 = new String[] {"Họ và tên: ", "Nguyễn Văn Tuyến"};
        for (int i = 0; i<mang6.length; i++) {
            System.out.println(mang6[i]);
        }

        mang6[0]="TuynTiu";
        //Duyệt mảng
        for (int i = 0; i<mang6.length; i++) {
            System.out.println(mang6[i]);
        }

        // update toàn bộ danh sách trong mảng
        int[] mang7 = new int[]{1,2,4,5,6,7,8,11};
        for (int i = 0; i<mang7.length;i++){
            mang7[i]+=5;
        }
        //Duyệt mảng sau đổi
        for (int i = 0; i<mang7.length; i++) {
            System.out.println("Mảng 7 sau khi update là: "+ mang7[i]);
        }

        //Sắp xếp tăng dần:
        int[] mang8 = {115,11,2,645,6,82,564,9999,994126484};
        Arrays.sort(mang8);
        System.out.println("Mang sau sắp xếp là:");
        System.out.println(Arrays.toString(mang8));

        //7. Đảo ngược mảng
        int[] mang9 = {8,9,12,48,1,2,3};
        for ( int i = 0, j = mang9.length-1; i<j; i++,j--){
            int temp = mang9[i];
            mang9[i] = mang9[j];
            mang9[j] = temp;
        }
        //Xuất mang
        System.out.println("Mảng sau đảo ngược là:");
        System.out.println(Arrays.toString(mang9));

        //8. Gắn mảng truy xuất cùng vùng nhớ.
        int[] mang10 = {1,2,22,44,3,4,55};
        int[] mang11 = mang10;
        mang10[0] = 100;
        System.out.println(Arrays.toString(mang10));
        System.out.println(Arrays.toString(mang11));
        //Clone: thay đổi 1 ptu riêng cho mảng đó
        int[] mang12 = {1,2,22,44,3,4,55};
        int[] mang13 = mang12.clone();
        mang13[0] = 99;
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(mang12));
        System.out.println(Arrays.toString(mang13));
    }
}
