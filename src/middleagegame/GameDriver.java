package middleagegame;

import java.util.ArrayList;
import java.util.List;

public class GameDriver {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<>();
        characters.add(new Queen());
        characters.add(new King());
        characters.add(new Knight());
        characters.add(new Troll());

        for (Character tempCharacter : characters) {
            tempCharacter.fight();
        }

        characters.get(0).setWeaponBehavior(new AxeBehavior());

        for (Character tempCharacter : characters) {
            tempCharacter.fight();
        }
    }
}
