package Players.utilities;

public enum CreatureType {
    DRAGON(20,20),
    OGRE(15,15),
    RAT(5,5),
    OWL(8,8),
    LION(14,14);

    private final int defence;
    private int currentLife;

    CreatureType(int defence,int currentLife) {
        this.defence = defence;
        this.currentLife= currentLife;
    }

    public int getCurrentLife() {
        return currentLife;
    }

    public void lowCurrentLife(int attackValue) {
        this.currentLife -= attackValue;
    }

    public int getDefence() {
        return defence;
    }

}
