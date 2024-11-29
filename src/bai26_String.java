import com.sun.source.tree.WhileLoopTree;

public class bai26_String {
    public static void main(String[] args) {
        String S = "Họ và tên: " +
                "\nNguyễn Văn Tuyến";
        System.out.println(S);

        //Khai báo đối tượng String
        StringBuilder chuoi = new StringBuilder();
        //Phương thức: append_Thêm vào cuối chuỗi.
        chuoi.append("Xin chào, ");
        chuoi.append("mình mới học JAVA.");
        chuoi.append(" Tôi sẽ cố gắng hết mình để hoàn thành tốt công việc được giao.");
        System.out.println(chuoi);

        //Phương thức 2: insert(vị trí index, chuỗi cần chèn)
        chuoi.insert(8, " Obama ");
        System.out.println(chuoi);

        //Phương thức 3: delete(start, end)
        //Xóa tất cả các kí tự từ vị trí: start đến vị trí: end-1
        chuoi.delete(8,15);
        System.out.println(chuoi);

        //Phương thức 4: length: trả về độ dài của chuỗi tính cả SPACE.
        System.out.println(chuoi.length());

        //Phương thức 5: IndexOf: Kiểm tra vị trí xuất hiện ĐẦU TIÊN của ký tự hoặc chuỗi.
        // trả về -1 nếu không tìm thấy.
        String s7 = "Tôi đang học JAVA và sắp tới tôi sẽ trở thành Pro JAVA";
        System.out.println(s7.indexOf("JAVA"));

        //Phương thức 6: IndexOf: Kiểm tra vị trí xuất hiện CUỐI CÙNG của ký tự hoặc chuỗi.
        // trả về -1 nếu không tìm thấy.
        System.out.println(s7.lastIndexOf("JAVA"));

        //Phương thức 7: Contains: Kiểm tra chuỗi con.
        String s9 =  ".mp3";
        String s10 = "Tự học .mp3";
        //Kiểm tra s10 có chứa cụm STRING của s9 không?
        boolean check = s10.contains(s9);
        if (check) {
            System.out.println("Có .mp3 trong chuỗi");
        }
        else {
            System.out.println("Không tìm thấy .mp3 trong chuỗi.");
        }

        //Phương thức 8: Substring: Trích lọc chuỗi con từ chuỗi ban đầu.
        String s11 = "abcdefgh";
        String s12 = s11.substring(4);
        System.out.println(s11);
        System.out.println(s12);

        //Phương tức 9: replace: thay thế toàn bộ kí tự trong chuỗi.
        String s13= "tôi đi tìm tôi";
        String s14 = s13.replace("tôi", "bạn");
        System.out.println(s14);

        //Phương tức 10: replaceFirst: thay thế kí tự đầu tiên trong chuỗi.
        String s15 = s13.replaceFirst("tôi", "bạn");
        System.out.println(s15);

        //Phương thức 11: trim(): Xóa toàn bộ khooảng SPACE ở đầu-cuối trong chuỗi.
        String s16 = "       NGUYEN VAN TUYEN          ";
        String s17 = s16.trim();
        System.out.println(s16);
        System.out.println(s17);

        // Phương thức 12: trim(): Xóa toàn bộ khooảng SPACE ở CUỐI trong chuỗi.
        // CÁCH 1: Biểu thức chính quy.
        // dùng \s+$ để xóa tất cả các khoảng trống ở cuối chuỗi.
        String s18 = s16.replaceAll("\\s+$", "");
        System.out.println(s16);
        System.out.println(s16.length());
        System.out.println(s18);
        System.out.println(s18.length());
        //CÁCH 2: XÓA KHOẢNG TRẮNG ở cuối chuỗi và sử dụng vòng lặp WHILE.
        String s19 = "       NGUYEN VAN TUYEN          ";
        while (s19.endsWith(" ")){
            s19 = s19.substring(0,s19.length()-1);
        }
        System.out.println(s19);

        //Phương thức 13: trim(): Xóa toàn bộ khooảng SPACE ở ĐẦU trong chuỗi.
        //Cách 1: Biểu thức chính quy.
        // dùng ^\\s+  để xóa tất cả các khoảng trắng ở đầu chuỗi.
        String s20 = "       NGUYEN VAN TUYEN          ";
        String s21 = s20.replaceFirst("^\\s+", "");
        System.out.println(s20);
        System.out.println(s21);
        //CÁCH 2: XÓA KHOẢNG TRẮNG ở ĐẦU chuỗi và sử dụng vòng lặp WHILE.
        String s25 = "       NGUYEN VAN TUYEN          ";
        while (s25.startsWith(" ")){
            s25 = s25.substring(1);
        }
        System.out.println(s25);

        // Phương thức 14: Tách chuỗi: split.
        String s38 = "Hello, world.";
        String [] mang = s38.split(" ");
        //Duyệt mảng
        for (int i=0; i<mang.length;i++) {
            System.out.println(mang[i]);
        }

        // Phương thức 15: toLowerCase && toUpperCase
        String s39 = "họ và tên: nguyễn VĂN Tuyến" ;
        String s40 = "HỌ VÀ TÊN: " ;
        String s41 = s40.toLowerCase();
        String s42 = s39.toUpperCase();
        System.out.println(s42);
        System.out.println(s41);

        //Phương thức 16: Tách chuỗi thành từng kí tự, cho vào mảng
        String s43 = "abasdh@123";
        char[] mang2 = s43.toCharArray();
        //Duyệt mảng
        for ( int i = 0; i<mang2.length; i++) {
            System.out.println(mang2[i]);
        }

        //Phương thức 17: reverse(): Đảo ngược chuỗi.
        String s44 = "1242sa@as51";
        // Bắt buộc phải khai báo đối tượng mới sử dụng được 'reverse'
        StringBuilder sb = new StringBuilder(s44);
        sb.reverse();
        String s45 = sb.toString(); //Chuyển sang chuỗi
        System.out.println(s45);
    }
}
