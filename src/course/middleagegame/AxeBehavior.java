package course.middleagegame;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Hit with an axe dealing 40 dmg");
    }
}
