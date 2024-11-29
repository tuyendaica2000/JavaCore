public class bai17_vdgiaiptb2 {
    public static void main(String[] args) {
        String KQ = GiaiPTB2(1,2,-3);
        String KQ2 = GiaiPTB2(3,2,-3);
        String KQ3 = GiaiPTB2(0,2,-69);
        String KQ4 = GiaiPTB2(5,0,29);
        System.out.println("Vậy kết quả ta thu được ở PT1: " +KQ);
        System.out.println("");
        System.out.println("");
        System.out.println("Vậy kết quả ta thu được ở PT2: " +KQ2);
        System.out.println("");
        System.out.println("");
        System.out.println("Vậy kết quả ta thu được ở PT2: " +KQ3);
        System.out.println("");
        System.out.println("");
        System.out.println("Vậy kết quả ta thu được ở PT2: " +KQ4);
    }

    //Hàm giải ptb2
    public static String GiaiPTB2(double a, double b, double c){
        //Nếu a=0 thì phương trình trở thành PTB1
        if (a==0){
            if (b==0 && c==0){
                return "\nPhương trình bậc nhất có vô số nghiệm";
            } else if (b==0 && c!=0) {
                return "\nPhương trình vô nghiệm.";
            }
            else {
                return "\nPhương trình bậc nhất có nghiệm: x= " +(-c/b);
            }
        }
        else {
            //Giari phương trình bậc 2
            double delta = (b*b) - (4*a*c);
            if (delta<0){
                return  "\nPhương trình vô nghiệm";
            } else if (delta==0) {
                double x= -b/(2*a);
                return  "\nPhương trình có 1 nghiệm duy nhất: x= " +(x);
            }
            else {
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                return "\nPhương trình có 2 nghiệm: \nx1= " +x1 + "\nx2= " +x2;

            }
        }
    }
}
