package generics.dwellers;

/**
 * Created by teacher-pc on 17.10.2018.
 */
public class Throll extends BaseDweller {
    public void move() {
        System.out.println("Тролль бегает по пещере");
    }

    public void openDoor() {
        System.out.println("Тролль открывает дверь");
    }

    public int compareTo(Object o) {
        return 0;
    }
}
