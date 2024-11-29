public class bai4_cacpheptoancoban {
    public static void main(String[] args) {
        int a = 37;
        int b = 15;
        System.out.println("a= " +a);
        System.out.println("b= " +b);

        //phép cộng
        System.out.println("a+b = " +(a+b));
        // gán biến
        int kq = a*b;
        System.out.println("a*b= " +kq);
        System.out.println("a-b = " +(a-b));
        System.out.println("a%b = " +(a%b));
        System.out.println("a/b = " +((double)a/b));


        //Bài tập vận dụng
        int i1 = 2;
        int i2 = 5;
        int i3 = -3;
        double d1 = 2.0;
        double d2 = 5.0;
        double d3 = -0.5;
        //Tìm kết quả cho các phép toán sau
        int A = i1 + (i2*i3);
        int B = i1 * (i2+i3);
        int C = i1 / (i2+i3);
        int E = i1/i2 + i3;
        int G = 3+4+5/3;
        int I = (3+4+5)/3;
        double K =  d1 + (d2*d3);
        double L =  d1 + d2*d3;
        double M =  d1/d2-d3;
        double N =  d1/(d2-d3);
        double O = d1+d2+d3/3;
        double P = (d1+d2+d3)/3;
        double Q = d1+d2+(d3/3);
        double R = 3*(d1+d2)*(d1-d3);
        System.out.println("KQ của phép tính A= " +A);
        System.out.println("KQ của phép tính B= " +B);
        System.out.println("KQ của phép tính C= " +C);
        System.out.println("KQ của phép tính E= " +E);
        System.out.println("KQ của phép tính I= " +I);
        System.out.println("KQ của phép tính K= " +K);
        System.out.println("KQ của phép tính L= " +L);
        System.out.println("KQ của phép tính M= " +M);
        System.out.println("KQ của phép tính N= " +N);
        System.out.println("KQ của phép tính O= " +O);
        System.out.println("KQ của phép tính P= " +P);
        System.out.println("KQ của phép tính Q= " +Q);
        System.out.println("KQ của phép tính R= " +R);

    }
}
