package Players.enemies;

import Behaviours.IFight;
import Players.Player;

public abstract class Enemy extends Player implements IFight {

    public Enemy(String name, double healthPoints, double coins) {
        super(name, healthPoints, coins);
    }
}
