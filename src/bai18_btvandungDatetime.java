import java.util.Calendar;
import java.util.Scanner;

public class bai18_btvandungDatetime {
    public static void main(String[] args) {
        /*
        Viết chương trình nhập vào ngày tháng năm sinh.
        Cho biết số tuổi và in ra màn hình.
        */
        int day, month,year,tuoi;
        //Nhập dữ liệu từ bàn phím
        /*Scanner input = new Scanner(System.in);
        System.out.println("Nhập ngày sinh của bạn: ");
        day = input.nextInt();
        System.out.println("Nhập tháng sinh của bạn: ");
        month = input.nextInt();
        System.out.println("Nhập nă, sinh của bạn: ");
        year = input.nextInt();

        //Khởi tạo đối tượng:
        Calendar birthday = Calendar.getInstance();
        //Set ngày tháng năm sinh do người dùng nhập vào
        birthday.set(year,month-1,day);
        // xuất ngày tháng năm sinh
        int namSinh = birthday.get(Calendar.YEAR);
        int thangSinh = birthday.get(Calendar.MONTH);
        int ngaySinh = birthday.get(Calendar.DAY_OF_MONTH);
        System.out.println("Ngày tháng năm sinh:" +ngaySinh +"/"+(thangSinh+1) +"/"+namSinh);

        //tính tuổi --> lấy được năm hiện tại.
        Calendar now = Calendar.getInstance();
        int namHientai = now.get(Calendar.YEAR);
        //Tính năm hiện tại
        tuoi = namHientai - namSinh;
        System.out.println("Tuổi của bạn là: " +tuoi);*/





        Scanner input = new Scanner(System.in);

        System.out.println("Nhập vào ngày sinh của bạn: ");
        day = input.nextInt();
        System.out.println("Nhập vào tháng sinh của bạn: ");
        month = input.nextInt();
        System.out.println("Nhập vào năm sinh của bạn: ");
        year = input.nextInt();

        //set Năm sinh
        Calendar birthday = Calendar.getInstance();
        birthday.set(year, month-1, day);
        int ngaySinh = birthday.get(Calendar.DAY_OF_MONTH);
        int thangSinh = birthday.get(Calendar.MONTH);
        int namSinh = birthday.get(Calendar.YEAR);
        System.out.println("Ngày tháng năm sinh của bạn: " +ngaySinh +"/"+ (thangSinh+1) +"/"+ namSinh);

        //Tính tuổi hiện tại
        Calendar now = Calendar.getInstance();
        int namHientai = now.get(Calendar.YEAR);
        int thangHientai = now.get(Calendar.MONTH);
        int ngayHientai = now.get(Calendar.DAY_OF_MONTH);

        tuoi = namHientai - namSinh;
        int thang = thangHientai - thangSinh;
        int ngay = Math.abs( ngayHientai - ngaySinh);
        System.out.println("Bạn sinh ra được: "+tuoi+" năm "+ (thang+1) +" tháng "+ngay+" ngày.");



        /*Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào ngày sinh của bạn: ");
        day = input.nextInt();
        System.out.println("Nhập vào tháng sinh của bạn: ");
        month = input.nextInt();
        System.out.println("Nhập vào năm sinh của bạn: ");
        year = input.nextInt();

        //Set ngày tháng năm sinh
        Calendar birthday = Calendar.getInstance();
        birthday.set(year, month-1, day);
        int namSinh = birthday.get(Calendar.YEAR);
        int thangSinh = birthday.get(Calendar.MONTH);
        int ngaySinh = birthday.get(Calendar.DAY_OF_MONTH);
        System.out.println("Ngày tháng năm sinh của bạn là: " +ngaySinh +"/"+ (thangSinh+1)+ "/" +namSinh);

        //Tính độ tuổi
        Calendar now = Calendar.getInstance();
        int namHientai = now.get(Calendar.YEAR);
        tuoi = namHientai - namSinh;
        System.out.println("tuổi = " +tuoi);*/

    }
}
