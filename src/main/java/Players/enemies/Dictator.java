package Players.enemies;

import Behaviours.IFight;
import Players.Player;

public class Dictator extends Player implements IFight {

    public Dictator(String name, double healthPoints, double coins) {
        super(name, healthPoints, coins);

    }

    public void attack(Player attackedPlayer) {

    }
}
