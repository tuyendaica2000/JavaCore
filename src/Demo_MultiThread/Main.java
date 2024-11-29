package Demo_MultiThread;

public class Main {
    public static void main(String[] args) {
        // Đầu tiên khai báo thằng ShareData
        ShareData shareData = new ShareData();

        // Tạo ra luồng Thread1, Thread2.
        Thread1 t1 = new Thread1(shareData);
        Thread2 t2 = new Thread2(shareData);

        //Cho Thread1, Thread2 start.
        t1.start();
        t2.start();
    }
}
