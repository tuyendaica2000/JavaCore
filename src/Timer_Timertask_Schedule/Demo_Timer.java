package Timer_Timertask_Schedule;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo_Timer {
    public static void main(String[] args) {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println(new Date().toString());
            }
        };

        long delay = 1000L;
        Timer timer = new Timer("Timer");
        timer.schedule(timerTask, 0,delay);
    }
}
