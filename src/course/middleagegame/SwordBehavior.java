package course.middleagegame;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Slash with a sword dealing 15 dmg");
    }
}
