package Players;

import Players.spiritual.Cleric;
import Players.utilities.HealType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ClericTest {
    Cleric cleric;
    HealType potion;
    HealType potion1;

    @Before
    public void setUp() {
        cleric = new Cleric("Josemi",100,0);
        potion = HealType.POTION;
        potion1 = HealType.DRINK;

    }

    @Test
    public void canAddPotion() {
        cleric.addHeal(potion);
        assertEquals(potion,cleric.getHeals().get(0));
    }

    @Test
    public void canSetCurrentHeal() {
        cleric.addHeal(potion);
        cleric.setHeal(potion);
        assertEquals(potion,cleric.getHeal());
    }

    @Test
    public void canNotReturnUnexistingPotionWhenSetHeal() {
        cleric.addHeal(potion);
        cleric.setHeal(potion1);
        assertNull(cleric.getHeal());
    }
}
