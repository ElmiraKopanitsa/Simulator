package kz.kopanitsa.task3.event;

import kz.kopanitsa.task3.brownbear.BrownBear;

public class Event {
    // сон:  +5 к здоровью и +50 к энергии
    // поесть ягод: +5 к здоровью и -30 к энергии

    public  void getEvent(BrownBear bear) {
        // случайная генерация событий

        int eventNumber = (int) (Math.random() * 100);

        if (eventNumber < 60) {
            System.out.println(sleep(bear));
        } else {
            eatBerriesAndPlants(bear);
        }
    }

    private String sleep(BrownBear bear) {
        // сон
        System.out.println("Медведь спит.");
        int health = bear.getHealth() + 5;
        int energy = bear.getEnergy() + 50;
        bear.setHealth(health);
        bear.setEnergy(energy);
        return "Медведь поспал. " + bear.checkBearHealth();

    }

    private void eatBerriesAndPlants(BrownBear bear) {
        // поедание ягод, орехов и прочей растительности
        System.out.println("Медведь ест ягоды.");
        int health = bear.getHealth() + 5;
        int energy = bear.getEnergy() - 30;
        bear.setHealth(health);
        bear.setEnergy(energy);
        System.out.println("Медведь поел ягоды, орехи и прочую растительность. " + bear.checkBearHealth());
    }


}
