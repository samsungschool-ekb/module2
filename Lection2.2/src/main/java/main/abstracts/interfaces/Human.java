package main.abstracts.interfaces;

import java.util.ArrayList;

/**
 * Created by teacher-pc on 13.10.2018.
 */
public class Human<T> {
    public Human(Controller controller) throws InterruptedException {
        ArrayList<String> list;
        log("Хочу посмотреть телевизор, включаем...");
        controller.power();
        Thread.sleep(1000);
        controller.channelUp();
        Thread.sleep(500);
        controller.channelUp();
        Thread.sleep(500);
        log("Отличный канал, надо сделать звук погромче!");
        controller.soundUp();
        Thread.sleep(500);
        controller.soundUp();
        log("Смотрим некоторое время...а потом выключаем телек");
        controller.power();
    }

    private void log(String msg){
        System.out.printf("[ЧЕЛОВЕК]:%s%n", msg);
    }
}
