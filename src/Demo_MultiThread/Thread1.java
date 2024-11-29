package Demo_MultiThread;

import java.util.Random;

public class Thread1 extends Thread{
    ShareData shareData;

    public Thread1(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int min = (int) 'a';
        int max = (int) 'z';
        int limit = max - min;

        Random random = new Random();

        while (shareData.checkAvaiable()) {
            synchronized (shareData) {
                // Sinh số ngẫu nhiên
                int rad = random.nextInt(limit) + min;

                // ép kiểu cho nó về dạng char
                char c = (char) rad;
                System.out.println("Ký tự sau khi random c = "+c);

                // Lưu nó vào shareData để sau sẽ cho THREAD 2 sử dụng.
                shareData.setRadC(c);

                shareData.notifyAll();
                try {
                    shareData.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                // Delay
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                //Thay đổi tgian theo hệ thống.
                shareData.addTime(2000);

            }
        }
        System.out.println("T1 stop.");
        synchronized (shareData){
            shareData.notifyAll();
        }
    }
}
