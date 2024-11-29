public class bai16_forlongnhau {
public static void main(String[] args) {
        for (int i = 1; i<=7; i++){
            for (int j = 1; j<=7; j++){

                System.out.print(i + "" +j+ "\t");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        //vẽ chứ N
        for (int i = 1; i<=7; i++){
            for (int j = 1; j<=7; j++){
                if (j==1 || j==7 || i==j) {
                    System.out.print(i + "" +j+ "\t");
                }
                else
                    System.out.print("" + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");


        // Hinh tam giac duoi ben trai
        for (int i=1; i<=7;i++){
            for (int j=1; j<=i; j++){
                System.out.print(i + "" +j+ "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        //vẽ hinh vuong
        for (int i = 1; i<=7; i++){
            for (int j = 1; j<=7; j++){
                if (i==1 || j==1 || i==7 || j==7) {
                    System.out.print(i + "" +j+ "\t");
                }
                else
                    System.out.print("" + "\t");
            }
            System.out.println("");
        }


        System.out.println("");
        System.out.println("");
        //vẽ tam giac duoi ben trai nhung bo giong o giua
        for (int i=1; i<=7;i++){
            for (int j=1; j<=i; j++){
                if(j<i -1){
                    System.out.print("");
                }
                System.out.print(i + "" +j+ "\t");
            }
            System.out.println("");
        }
    }
}
