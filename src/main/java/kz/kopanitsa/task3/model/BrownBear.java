package kz.kopanitsa.task3.model;

public class BrownBear {
    // создание класса Бурый Медведь
    private int health; // переменная здоровья
    private int energy; // переменная энергии
    public static final float HEALTH_PRODUCE_COEFFICIENT = 2.5f; // постоянный коэффициент

    public void setHealth(int health) {
        // метод присваивания значения уровня здоровья
        this.health = health;
    }

    public int getHealth () {
        // метод получения уровня здоровья
        return this.health;
    }

    public void setEnergy(int energy) {
        // метод присваивания значения уровня энергии
        this.energy = energy;
    }

    public int getEnergy() {
        // метод получения уровня энергии
        return this.energy;
    }

    public String printBearLifeStatus() {
        return "\nСамочувствие Медведя: здоровье - " + this.getHealth() + ", энергия - " + this.getEnergy();
    }

    public boolean checkBearLife() {
        if (this.energy <= 0) {
            this.health -= 50;
        }
        return  this.health > 0;
    }
}
