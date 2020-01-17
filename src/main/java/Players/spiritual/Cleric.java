package Players.spiritual;

import Behaviours.IHeal;
import Players.Player;
import Players.utilities.HealType;

import java.util.ArrayList;

public class Cleric extends Player implements IHeal {
    private HealType healing;
    private ArrayList<HealType> healings;

    public Cleric(String name, double healthPoints, double coins) {
        super(name, healthPoints, coins);
        this.healing = null;
        this.healings = new ArrayList<HealType>();

    }

    public HealType getHeal() {
        return healing;
    }

    public ArrayList<HealType> getHeals() {
        return healings;
    }

    public void setHeal(HealType heal) {
        if(getHeals().indexOf(heal) != -1){
            this.healings.remove(heal);
            this.healing = heal;
        }
    }

    public void addHeal(HealType healing) {
        this.healings.add(healing);
    }



    public void healing() {
    }
}
