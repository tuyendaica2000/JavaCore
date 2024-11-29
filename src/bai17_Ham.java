public class bai17_Ham {
    public static void main(String[] args) {
        int kq = Cong(1,2,3);
        System.out.println("Tổng các số bằng= " +kq);
        // Gọi hàm XinChao
        XinChao("male");
        XinChao("femalee");

    }

    public static int Cong(int x, int y, int z) {
        return x+y+z;
    }

    // Hàm thủ tục. Hàm không có giá trị trả về nên không thể gán biến được cho nó.
    public static void XinChao(String gioitinh) {
        if (gioitinh.equals("female")){
            System.out.println("Xin cho tôi là nv NỮ ");
        }
        else if (gioitinh.equals("male")){
            System.out.println("Xin cho tôi là nv NAM ");
        }
        else {
            System.out.println("Tôi không hiểu bạn nhập cái gì???");
        }
    }
}
