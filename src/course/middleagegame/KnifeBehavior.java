package course.middleagegame;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Stab with a knife dealing 5 dmg");
    }
}
