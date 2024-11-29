package Demo_MultiThread;

public class ShareData {
    char radC;
    int totalTime = 0;

    public ShareData() {
    }

    public char getRadC() {
        return radC;
    }

    public void setRadC(char radC) {
        this.radC = radC;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public synchronized void addTime(int time){
        totalTime += time;
    }

    public synchronized boolean checkAvaiable() {
        if (totalTime >= 20000){
            return false;
        }
        return true;
    }
}
