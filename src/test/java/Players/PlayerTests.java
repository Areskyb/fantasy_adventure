package Players;

import Players.enemies.Dictator;
import Players.sorcerers.Warlock;
import Players.sorcerers.Wizard;
import Players.utilities.SpellType;
import Players.utilities.WeaponType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTests {

    Dictator dictator;
    Warlock warlock;
    Wizard wizard;

    @Before
     public void before(){
        dictator = new Dictator("Musolini",100,0);
        warlock = new Warlock("Warli",30,0);
        wizard = new Wizard("Wizi",30,0);

    }

    @Test
    public void dictatorHasProperties() {
        assertEquals("Musolini",dictator.getName());
        assertEquals(100,dictator.getHealthPoints(),0.01);
        assertEquals(0,dictator.getCoins(),0.01);
    }


}
