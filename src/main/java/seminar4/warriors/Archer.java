package seminar4.warriors;

import seminar4.weapons.Weapon;
import seminar4.weapons.rangedWeapon.Ranged;

public class Archer extends Warrior{
    public Archer(String name, int healthPoint, Ranged weapon) {
        super(name, healthPoint, weapon);
    }

    public int distance(){
        return ((Ranged)super.getWeapon()).distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d",super.toString(), distance());
    }
}
