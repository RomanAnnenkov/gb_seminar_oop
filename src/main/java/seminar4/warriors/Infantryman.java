package seminar4.warriors;

import seminar4.weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior{

    public Infantryman(String name, int healthPoint, Melee weapon) {
        super(name, healthPoint, weapon);
    }

    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}
