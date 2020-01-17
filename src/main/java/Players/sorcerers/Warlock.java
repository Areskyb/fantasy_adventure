package Players.sorcerers;

import Behaviours.IFight;
import Players.Player;
import Players.utilities.HealType;
import Players.utilities.SpellType;

import java.util.ArrayList;

public class Warlock extends Player implements IFight {
    private SpellType spell;
    private ArrayList<SpellType> spells;

    public Warlock(String name, double spellthPoints, double coins) {
        super(name, spellthPoints, coins);
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
