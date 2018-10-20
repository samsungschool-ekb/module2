package threads;

/**
 * Created by teacher-pc on 20.10.2018.
 */
public class ThreadExample extends Thread {
    private int sleepTime;
    private Resources res;
    ThreadExample(Resources res,String threadName, int sleepTime) {
        setName(threadName);
        this.sleepTime = sleepTime;
        this.res = res;
        start();
    }

    @Override
    public void run() {
        synchronized (res) {
            for (int i = 0; i < 5; i++) {
                System.out.printf("Thread: %s, i:%d%n", getName(), i);
                res.setA(i);
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
