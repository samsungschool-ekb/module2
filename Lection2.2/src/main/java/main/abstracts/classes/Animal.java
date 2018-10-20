package main.abstracts.classes;

/**
 * Created by teacher-pc on 13.10.2018.
 */
public abstract class Animal {
    String breed, name;

    public abstract void eat();
    public abstract void sleep();
    public abstract void move();

    public void showBaseActionsOfAnimal(){
        eat();
        sleep();
        move();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
