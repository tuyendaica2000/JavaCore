public class bai23_ThuvienToanhoc {
    public static void main(String[] args) {
        System.out.println("Pi= " +Math.PI);

        //Trị tuyệt đối
        int a = -8;
        System.out.println("GIÁ TRỊ TUYỆT ĐỐI CỦA SỐ NGUYÊN a= -8 là: |a|="+Math.abs(a));

        //Max-Min:
        System.out.println("Gía trị MAX của 2 số: 5-8 là: " +Math.max(5,8));
        System.out.println("Gía trị MIN của 2 số: 5-8 là: " +Math.min(5,8));

        //Căn bậc 2:
        System.out.println("Căn bậc 2 của 10 = " +Math.sqrt(10));

        // Lũy thừa
        System.out.println("Lũy thừa của 2^3= " +Math.pow(2,3));

        //Sin, cos, tan
        int goc = 90;
        double sin = Math.sin(Math.PI*goc/180);
        double cos = Math.cos(Math.PI*goc/180);
        double tan = Math.tan(Math.PI*goc/180);
        System.out.println("sin của 60= " +sin +"\ncos của 60= "+cos + "\ntan của 60= "+tan);
    }
}
