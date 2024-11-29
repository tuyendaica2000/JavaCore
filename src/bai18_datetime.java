import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class bai18_datetime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);

        //Xuất ra thông báo:
        System.out.println("Năm nay là năm: "+nam);
        System.out.println("Tháng này là tháng: "+ (thang+1));
        System.out.println("Ngày hôm nay là: "+ (ngay) + "/" +(thang+1) +"/"+nam);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        // setup ngày
        cal.set(Calendar.YEAR,2001);
        cal.set(Calendar.MONTH,1);
        cal.set(Calendar.DAY_OF_MONTH,16);
        int namSinh = cal.get(Calendar.YEAR);
        int thangSinh = cal.get(Calendar.MONTH);
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
        //Xuất ra thông báo:
        System.out.println("Ngày tháng năm sinh của: Nguyễn Văn Tuyến là: "+ngaySinh+"/"+(thangSinh+1)+"/"+namSinh);

        // Xuất theo định dạng
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        //Tạo 1 đối tượng date để get time  trong đối tượng cal
        Date d = cal.getTime();
        String s = dinhDang.format(d);
        System.out.println(s);

    }
}
