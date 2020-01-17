package Players.sorcerers;

import Behaviours.IFight;
import Players.Player;
import Players.utilities.SpellType;
import java.util.ArrayList;

public class Wizard extends Player implements IFight {
   private SpellType spell;
   private ArrayList<SpellType> spells;

    public Wizard(String name, double healthPoints, double coins) {
        super(name, healthPoints, coins);
        this.spell = null;
        this.spells = new ArrayList<SpellType>();

    }

    public SpellType getSpell() {
        return spell;
    }

    public ArrayList<SpellType> getSpells() {
        return spells;
    }

    public void setSpell(SpellType spell) {
        if(getSpells().indexOf(spell) != -1){
            this.spells.remove(spell);
            this.spell = spell;
        }
    }

    public void addSpell(SpellType spell) {
        this.spells.add(spell);
    }



    public void attack() {
    }
}
