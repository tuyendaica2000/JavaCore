import java.util.Scanner;

public class bai25_Char {
    public static void main(String[] args) {
        //Khai báo biến
        char ch = 'a';
        char ch2 = 84; //khởi tạo
        System.out.println(ch2);
        char ch3; //Khai báo
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kí tự: ");
        String s = sc.nextLine();
        char ch4 = s.charAt(0);
        System.out.println(ch4);

        // SO SÁNH
        System.out.println(Character.compare('x','X'));
        System.out.println(Character.compare('a','a'));
        System.out.println(Character.compare('T','t'));

        char ch5 = '1';
        char ch6 = 'a';
        char ch7 = 'A';
        char ch8 = ' ';

        System.out.println(Character.isDigit(ch5)); // Kiểm tra là chữ số ?
        System.out.println(Character.isLetter(ch6)); // Kiểm tra có phải là chữ cái ?
        System.out.println(Character.isLowerCase(ch6)); // Kiểm tra kí tự viết thường ?
        System.out.println(Character.isUpperCase(ch7)); // Kiểm tra kí tự viết HOA?
        System.out.println(Character.isWhitespace(ch8)); // // Kiểm tra kí tự dấu: "SPACE" ?
    }
}
