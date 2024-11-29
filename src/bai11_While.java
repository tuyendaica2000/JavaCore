import java.util.Scanner;

public class bai11_While {
    public static void main(String[] args) {
        /*int x = 0;
        while (x<=16) {
            System.out.println("x= "+x);
            x++;
        }*/

        //Bai tap
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so nguyen tu 1-99:");
        int n = sc.nextInt();
        while (n<1 || n>99){
            System.out.println("Nhap sai so nguyen, vui long nhap lai:");
            n = sc.nextInt();
        }
        System.out.println("So nguyen ban vua nhap la: "+n);
    }
}
