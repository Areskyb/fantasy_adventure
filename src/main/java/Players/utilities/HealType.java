package Players.utilities;

public enum HealType {
    POTION(15),
    HERBS(10),
    DRINK(5);

    private final int healthRevive;

    HealType(int healthRevive) {
        this.healthRevive = healthRevive;
    }

    public int getHealthRevive() {
        return healthRevive;
    }
}
