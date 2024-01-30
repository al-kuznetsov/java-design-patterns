package middleagegame;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior wb) {
        this.weaponBehavior = wb;
    }

    public void fight() {
        weaponBehavior.useWeapon();
    }
}
