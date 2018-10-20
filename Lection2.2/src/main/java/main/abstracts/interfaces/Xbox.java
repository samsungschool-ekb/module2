package main.abstracts.interfaces;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by teacher-pc on 13.10.2018.
 */
public class Xbox implements Controller, Runnable, MouseListener, KeyListener {
    public void channelUp() {
        System.out.println("{XBOX}Следующая игра");
    }

    public void channelDown() {
        System.out.println("{XBOX}Предыдущая игра");
    }

    public void soundUp() {
        System.out.println("{XBOX}звук вверх");
    }

    public void soundDown() {
        System.out.println("{XBOX}звук вниз");
    }

    public void power() {
        System.out.println("{XBOX}вкл/выкл");
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void run() {

    }
}
