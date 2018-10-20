package main;

import main.abstracts.classes.Cat;
import main.abstracts.classes.Dog;
import main.abstracts.interfaces.Human;
import main.abstracts.interfaces.TV;
import main.abstracts.interfaces.Xbox;
import main.abstracts.pasha.Chel;
import main.abstracts.pasha.Machine;
import main.abstracts.pasha.Skuter;
import main.abstracts.pasha.Velik;
import main.staticContext.CustomMath;
import main.staticContext.Second;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * Created by teacher-pc on 13.10.2018.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.showBaseActionsOfAnimal();
        dog.showBaseActionsOfAnimal();
        new Human(new TV());
        new Human(new Xbox());
        JFrame f = new JFrame("Координаты мышки");
        f.setSize(1024, 768);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent e) {
                System.out.printf("mouse dragged[%d][%d]%n", e.getX(), e.getY());
            }

            public void mouseMoved(MouseEvent e) {
                System.out.printf("mouse moved[%d][%d]%n", e.getX(), e.getY());
            }
        });
        f.setVisible(true);
        new Chel(new Velik());
        new Chel(new Skuter());
        new Chel(new Machine());
    }


}
