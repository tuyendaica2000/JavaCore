package Demo_MultiThread;

public class Thread2 extends Thread{
    ShareData shareData;

    public Thread2(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        // ta sử dụng vòng lặp để kiểm tra tằng checkAvaiable trả về FALSE thôi để dừng.
        while (shareData.checkAvaiable()){
            synchronized (shareData){
                shareData.notifyAll();
                try {
                    shareData.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                char c = shareData.getRadC();

                //Chuyển đổi kí tự c ==> kí tự c (từ kí tự thường thành kí tự hoa).
                int code = (int) c - 32;
                c = (char) code;
                System.out.println("Ký tự ở Thread 2 sau khi được chuyển đổi: " + c);

                //Delay thời gian theo yêu cầu
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //Add thêm tgian vào thằng shareData
                shareData.addTime(1000);
            }
        }
        System.out.println("t2 stopppp");
    }
}
