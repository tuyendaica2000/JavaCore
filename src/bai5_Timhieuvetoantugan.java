public class bai5_Timhieuvetoantugan {
    public static void main(String[] args) {
        //Phép cộng
        int x=8;
        x+=5;
        System.out.println("x =" +x);

        //Phép trừ
        int x2=82;
        x2-=55;
        System.out.println("x2= " +x2);

        //Phép nhân
        int x3=2;
        x3*=55;
        System.out.println("x3= " +x3);

        //Phép chia
        int x4=28;
        x4/=4;
        System.out.println("x4= " +x4);

        //Phép chia
        int x5=28;
        x5%=5;
        System.out.println("x5= " +x5);

        // so sánh
        int a = 10;
        int b = 11;
        System.out.println(a==b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a!=b);

        // bài tập Java01
        int c=6;
        int d= c+=3;
        int e= c-=5;
        int f= c*=2;
        double g= c%=5;
        int B=2;
        int h= c-(B-7);
        int l= c-=(B-7);
        System.out.println("Với c=6\nKq cua c+=3 = "+d);
        System.out.println("Kq cua c-=5 = " +e);
        System.out.println("Kq cua c*=2 = " +f);
        System.out.println("Kq cua c%=5 = " +g);
        System.out.println(h==l);

    }


}
