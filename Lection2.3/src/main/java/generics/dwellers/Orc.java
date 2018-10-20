package generics.dwellers;

/**
 * Created by teacher-pc on 17.10.2018.
 */
public class Orc extends BaseDweller {
    public void move() {
        System.out.println("Орк бегает по пещере");
    }

    public void openDoor() {
        System.out.println("Орк открывает дверь");
    }

    public int compareTo(Object o) {
        return 0;
    }
}
