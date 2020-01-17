package Players.utilities;

public enum WeaponType {
    SWORD(6),
    AXE(5),
    CLUB(8),
    BAZOOKA(10),
    BOW(9),
    INSULT(1);

    private final int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
