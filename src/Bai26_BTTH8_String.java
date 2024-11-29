import java.util.Scanner;

public class Bai26_BTTH8_String {
    public static void main(String[] args) {
        /* BÀI 8
        * Nhập vào 1 chuỗi --> tối ưu hóa chuỗi theo quy tắc:
        * 1. Không có khoảng trống dư thừa.
        * 2. Các từ cách nhau bởi 1 khoảng trắng.
        * 3. Ký tự đầu tiên của mỗi từ phải được viết hoa.
        * VD: "   NGUYỄN VĂn   TuyẾN    " ==> "Nguyễn Văn Tuyến"
        * */
        String chuoi = "   NGUYỄN VĂn   TuyẾN    " ;
        System.out.println(chuanHoa(chuoi));

    }

    // HÀM
    public static String chuanHoa(String input){
        //Xóa khoảng trắng ở đầu-cuối chuỗi: trim()
        input = input.trim();

        //Tách từng phần tử, sdung biểu thức chính quy \s+ để tách theo các khoảng trắng liên tiếp(nếu có).
        String[] words = input.split("\\s+");
        for ( int i = 0; i<words.length; i++){
           words[i] = words[i].toLowerCase();
           String firstChar = words[i].substring(0,1);
           firstChar = firstChar.toUpperCase();
           words[i] = firstChar+words[i].substring(1);

        }
        return  String.join(" ", words);
    }
}
