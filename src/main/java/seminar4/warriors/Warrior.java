package seminar4.warriors;

import seminar4.weapons.Weapon;

import java.util.Random;

public abstract class Warrior {
    private final String name;
    private int healthPoint;
    private Weapon weapon;

    public Warrior(String name, int healthPoint, Weapon weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int hit() {
        Random rnd = new Random();

        return rnd.nextInt(0, weapon.damage() + 1);
    }

    public void rediceHealth(int damage){
        healthPoint -= damage;
        if (healthPoint < 0) {
            healthPoint = 0;
        }
    }

}
