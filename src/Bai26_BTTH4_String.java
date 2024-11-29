public class Bai26_BTTH4_String {
    public static void main(String[] args) {
        /* BÀI 4
        * Cho chuỗi a: "tôi chăm học tôi chịu khó tôi chơi thể thao"
        * Đếm từ "tôi" trong chuỗi trên
        * */
        String a = "tôi chăm học tôi chịu khó tôi chơi thể thao";
        //Tách chuỗi theo từng từ riêng biệt.
        String[] words = a.split(" ");
        int count = 0;
        for (String tu:words){
            if (tu.equals("tôi")){
                count++;
            }
        }

    }
}
