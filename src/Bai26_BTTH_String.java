public class Bai26_BTTH_String {
    public static void main(String[] args) {
        /* BAI 1
        * String str1 = "English = 78 Science = 83 Math = 68 History = 65"
        * 1.Tính tổng các số trong chuỗi trên.
        * 2.Tính trung bình cộng.
        * */

        /*String str1 = "English = 78 Science = 83 Math = 68 History = 65 Chemist = 69 Technology = 86";
        int sum = 0; //biến tính tổng.
        int count = 0; //Biến lưu số lượng số.
        //TÁCH chuỗi thành các phần bằng nhau bằng cách sử dụng split() ở lớp String.
        String[] parts = str1.split(" ");
        // Duyệt qua từng phần và chyển nó sang kiểu số nếu có thể.
        for (String pt : parts){
            System.out.println(pt);
            try {
                //Chuyển chuỗi sang số bằng phương thức parseInt() của lớp Integer
                int num = Integer.parseInt(pt);
                sum+=num; //Cộng thêm số vào tổng
                count++;
            }catch (NumberFormatException e){
                // Không thực hiện gì cả.
            }
        }
        // Tinnh trung bình cộng
        double tbc = (double) sum/count;
        System.out.println("Tổng các số trong chuỗi là: " +sum);
        System.out.println("Trung bình cộng các số trong chuỗi là: " +tbc);*/
    }
}
