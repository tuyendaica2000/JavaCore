public class Bai26_BTTH6_String {
    public static void main(String[] args) {
        /* BÀI 6
        * Viết ct trích lọc String từ đường dẫn D:/Java/Demo/nhachay.mp3
        * 1. Tách tên tệp bao gồm cả đuôi: nhachay.mp3
        * 2. Tách tên file: Demo
        * */
        String path = "D:/Java/Demo/nhachay.mp3";
        int lastSlashIndex = path.lastIndexOf('/');
        String filename = path.substring(lastSlashIndex+1);
        System.out.println(filename);

        int lastDotIndex = filename.lastIndexOf('.');
        String nameFILE = filename.substring(0,lastDotIndex);
        System.out.println(nameFILE);

    }
}
