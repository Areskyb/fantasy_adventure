package Players.utilities;

public enum SpellType {
    FIREBALL(12),
    LIGHTNINGSTRIKE(15),
    MAGICDUST(4),
    ACIDRAIN(10),
    EARTHQUAKE(11);

    private final int damage;

    SpellType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
