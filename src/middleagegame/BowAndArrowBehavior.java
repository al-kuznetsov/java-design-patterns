package middleagegame;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Send an arrow dealing 10 dmg");
    }
}
