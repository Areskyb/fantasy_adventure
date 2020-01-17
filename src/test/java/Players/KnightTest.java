package Players;


import Players.utilities.WeaponType;
import Players.warriors.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class KnightTest {
    Knight knight;
    WeaponType weapon;
    WeaponType weapon1;

    @Before
    public void setUp() {
        knight = new Knight("Josemi",100,0);
        weapon = WeaponType.AXE;
        weapon1 = WeaponType.CLUB;

    }

    @Test
    public void canAddPotion() {
        knight.addWeapon(weapon);
        assertEquals(weapon,knight.getWeapons().get(0));
    }

    @Test
    public void canSetCurrentHeal() {
        knight.addWeapon(weapon);
        knight.setWeapon(weapon);
        assertEquals(weapon,knight.getWeapon());
    }

    @Test
    public void canNotReturnUnexistingPotionWhenSetHeal() {
        knight.addWeapon(weapon);
        knight.setWeapon(weapon1);
        assertNull(knight.getWeapon());
    }
}
