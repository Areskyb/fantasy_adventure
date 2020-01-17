package Players;

import Behaviours.IFight;

public abstract class Player {
    private double healthPoints;
    private double coins;
    private String name;

    public Player(String name, double healthPoints, double coins) {
        this.healthPoints = healthPoints;
        this.coins = coins;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public double getCoins() {
        return coins;
    }

    public void reduceHealth(int amount){
        this.healthPoints -= amount;
    }

    public void addCoins(double amount){
        this.coins += amount;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setCoins(double coins) {
        this.coins = coins;
    }
}
