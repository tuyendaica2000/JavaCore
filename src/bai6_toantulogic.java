public class bai6_toantulogic {
    public static void main(String[] args) {
        int i = 17;
        //Kiểm tra giá trị i>0 và i<10 không
        System.out.println(i>0 && i<10);

        //Kiểm tra i>10 hoặc i< -1
        System.out.println(i>10 || i<-1);

        // Phép phủ định
        System.out.println(!(i>10 || i<-1));

        int a=1;
        int b=2;
        int c= a++ - ++b +1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
