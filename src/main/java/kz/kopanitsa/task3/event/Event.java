package kz.kopanitsa.task3.event;

import kz.kopanitsa.task3.brownbear.BrownBear;

public class Event {
    // сон:  +5 к здоровью и +50 к энергии
    // поесть ягод: +5 к здоровью и -30 к энергии
    // поесть насекомых: +1 к здоровью и -10 к энергии
    // поесть рыбу: +10 к здоровью и -30 к энергии
    // ест крупную добычу: +10 к здоровью
    // готовится к спячке: -50 к энергии
    // подрался с другим медведем: -(25*коэффициент) к здоровью и -75 к энергии
    // залез на дерево: -25 к энергии
    // медведь встретил охотника и съел его: +20 к здоровью и -50 к энергии
    // состарился и умер, прожив счастливую жизнь

    public  void getEvent(BrownBear bear) {
        // случайная генерация событий

        int eventNumber = (int) (Math.random() * 100);

        if (eventNumber < 20) {
            System.out.println(sleep(bear));
        } else if (eventNumber < 30) {
            eatBerriesAndPlants(bear);
        } else if (eventNumber < 40) {
            eatInsects(bear);
        } else if (eventNumber < 50) {
            eatFish(bear);
        } else if (eventNumber < 60) {
            eatMeat(bear);
        } else if (eventNumber < 65) {
            prepareForHibernation(bear);
        } else if (eventNumber < 75) {
            fight(bear);
        } else if (eventNumber < 80) {
            climbTree(bear);
        } else if (eventNumber < 85) {
            meetHunter(bear);
        } else {
            died(bear);
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

    private void eatInsects (BrownBear bear) {
        // поедание насекомых
        System.out.println("Медведь ест насекомых.");
        int health = bear.getHealth() + 1;
        int energy = bear.getEnergy() - 10;
        bear.setHealth(health);
        bear.setEnergy(energy);
        System.out.println("Медведь поел насекомых. " + bear.checkBearHealth());
    }

    private void eatFish(BrownBear bear) {
        //поедание рыбы
        System.out.println("Медведь ест рыбу.");
        int health = bear.getHealth() + 10;
        int energy = bear.getEnergy() - 30;
        bear.setHealth(health);
        bear.setEnergy(energy);
        System.out.println("Медведь поел рыбу. " + bear.checkBearHealth());
    }

    private void eatMeat(BrownBear bear) {
        //поедание крупной добычи
        System.out.println("Медведь ест мясо.");
        int health = bear.getHealth() + 10;
        bear.setHealth(health);
        System.out.println("Медведь поел мясо. " + bear.checkBearHealth());
    }

    private void prepareForHibernation(BrownBear bear) {
        //подготовка к спячке
        System.out.println("Медведь готовится к спячке.");
        int energy = bear.getEnergy() - 50;
        bear.setEnergy(energy);
        System.out.println("Медведь приготовился к спячке. " + bear.checkBearHealth());
    }

    private void fight(BrownBear bear) {
        // драка с другим медведем
        System.out.println("Медведь встретил другого медведя и вступил с ним в драку.");
        int health = bear.getHealth() - (int) (25 * BrownBear.coefficient);
        int energy = bear.getEnergy() - 75;
        bear.setHealth(health);
        bear.setEnergy(energy);
        System.out.println("Драка медведей завершилась. " + bear.checkBearHealth());
    }

    private void climbTree(BrownBear bear) {
        // завезание на дерево
        System.out.println("Медведь лезет на дерево.");
        int energy = bear.getEnergy() - 25;
        bear.setEnergy(energy);
        System.out.println("Медведь залез на дерево и слез обратно. " + bear.checkBearHealth());
    }

    private void meetHunter(BrownBear bear) {
        // встреча с охотником
        System.out.println("Медведь встретил охотника.");
        int health = bear.getHealth() + 20;
        int energy = bear.getEnergy() - 50;
        bear.setHealth(health);
        bear.setEnergy(energy);
        System.out.println("Медведь съел охотника. " + bear.checkBearHealth());
    }
    private void died(BrownBear bear) {
        // смерть от старости
        bear.setHealth(0);
        System.out.println("Медведь прожил счастливую жизнь и умер от старости.");
    }
}
