package kz.kopanitsa.task3.event;

import kz.kopanitsa.task3.brownbear.BrownBear;

public class Event {
    public void getEvent() {

    }

    private String sleep (BrownBear bear) {
        System.out.println("Медведь спит.");
        int healthBeforeSleep = bear.getHealth();
        bear.setHealth(healthBeforeSleep + 10);
        return "Медведь поспал" + bear.checkBear();

    }


}
