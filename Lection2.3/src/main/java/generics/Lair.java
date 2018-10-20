package generics;

import generics.dwellers.BaseDweller;

/**
 * Created by teacher-pc on 17.10.2018.
 */
public class Lair<T extends BaseDweller & Comparable> {
    T dweller;

    public T getDweller() {
        return dweller;
    }

    public void setDweller(T dweller) {
        this.dweller = dweller;
    }

    public void openDoorAll(){
        dweller.openDoor();
    }
}
