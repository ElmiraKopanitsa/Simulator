package kz.kopanitsa.task3.brownbear;

public class BrownBear {
    // создание класса Бурый Медведь
    private int health; // переменная здоровья
    private int energy; // переменная энергии
    static final float coefficient = 2.5f; // постоянный коэффициент

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

    public String checkBearHealth() {
        return "\nСамочувствие Медведя: здоровье " + this.getHealth() + "энергия - " + this.getEnergy();
    }

    public boolean checkBearLife() {

        return  this.health > 0;
    }
}
