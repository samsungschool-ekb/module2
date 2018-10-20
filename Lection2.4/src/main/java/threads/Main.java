package threads;

/**
 * Created by teacher-pc on 20.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        Resources res = new Resources();
        Thread t1 = new ThreadExample(res, "поток_1", 500);
        Thread t2 = new ThreadExample(res, "поток_2", 350);
        Thread t3 = new ThreadExample(res, "поток_3", 1000);
        Thread t4 = new ThreadExample(res, "поток_4", 750);


        Thread.currentThread().setName("ГЛАВНЫЙ ПОТОК");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Thread: %s, i:%d%n", Thread.currentThread().getName(), i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
