package kz.kopanitsa.task3._main;

import kz.kopanitsa.task3.brownbear.BrownBear;
import kz.kopanitsa.task3.event.Event;

public class _Main {
    public static void main(String[] args) {
        BrownBear myBear = new BrownBear();
        myBear.setHealth(100);
        myBear.setEnergy(100);
        Event myEvent = new Event();
        while (myBear.checkBearLife()) {
            myEvent.getEvent(myBear);
        }
    }
}
