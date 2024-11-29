import java.util.Scanner;

public class bai10_Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Mời nhập vào số nguyên: ");
        int a = sc.nextInt();
        //kiem tra so du
        int div = a%2;
        switch (div){
            case 0:
                System.out.println(a+ "là số chẵn");
                break;
            default:
                System.out.println(a+ "là số lẻ");
                break;
        }

        // kiem tra thang co bao nhieu ngay
        System.out.println("Nhap thang ban muon kiem tra: ");
        int thang = sc.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang "+thang + " la thang co 31 ngay.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang "+thang +" ka thang co 30 ngay.");
                break;
            case 2:
                System.out.println("Thang "+thang +" ka thang co 28 ngay.");
                break;
        }*/

        //Bai tap tim theo so
        System.out.println("Moi bam so de chon:");
        System.out.println("1. Tim theo ten");
        System.out.println("2. Tim theo tac gia");
        System.out.println("3. Tim theo nha xuat ban");
        System.out.println("4. Tim theo tieu de");
        int x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.println("Tim theo ten");
                break;
            case 2:
                System.out.println("Tim theo tac gia");
                break;
            case 3:
                System.out.println("Tim theo nha xuat ban");
                break;
            case 4:
                System.out.println("Tim theo tieu de");
                break;
            default:
                System.out.println("Phim bam khong hop le!");
                break;
        }
    }
}
