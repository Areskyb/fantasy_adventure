package Players.warriors;

import Behaviours.IFight;
import Players.Player;
import Players.utilities.WeaponType;

import java.util.ArrayList;

public class Knight extends Player implements IFight {
    private WeaponType weapon;
    private ArrayList<WeaponType> weapons;


    public Knight(String name, double healthPoints, double coins) {
        super(name, healthPoints, coins);
        this.weapon = null;


        this.weapons = new ArrayList<WeaponType>();

    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public ArrayList<WeaponType> getWeapons() {
        return weapons;
    }

    public void setWeapon(WeaponType spell) {
        if(getWeapons().indexOf(spell) != -1){
            this.weapons.remove(spell);
            this.weapon = spell;
        }
    }
    public void addWeapon(WeaponType weapon) {
        this.weapons.add(weapon);
    }



    public void attack() {
    }
}
