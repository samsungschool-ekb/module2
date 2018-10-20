package main.abstracts.interfaces;

/**
 * Created by teacher-pc on 13.10.2018.
 */
public class TV implements Controller {
    String[] channelsList = {"Discovery", "National Geographics", "Disney", "MTV"};
    private int soundLevel, currentChannel;
    boolean power;
    private final int SOUND_LEVEL_MAX = 10;

    public void channelUp() {
        if (currentChannel < channelsList.length - 1) {
            currentChannel++;
        } else {
            currentChannel = 0;
        }
        System.out.printf("Текущий канал: %s%n", channelsList[currentChannel]);
    }

    public void channelDown() {
        if (currentChannel > 0) {
            currentChannel--;
        } else {
            currentChannel = channelsList.length;
        }
        System.out.printf("Текущий канал: %s%n", channelsList[currentChannel]);
    }

    public void soundUp() {
        if(soundLevel <= SOUND_LEVEL_MAX)
            soundLevel++;
        System.out.printf("Уровень звука:%d%n", soundLevel);
    }

    public void soundDown() {
        if(soundLevel >= 0)
            soundLevel--;
        System.out.printf("Уровень звука:%d%n", soundLevel);
    }

    public void power() {
        if (!power)
            power = true;
        else
            power = false;
        System.out.printf("Питание:%b%n", power);
    }
}
