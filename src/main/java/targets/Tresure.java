package targets;

import Behaviours.IPlay;
import Players.Player;

import java.util.ArrayList;

public class Tresure implements IPlay {
    int coins;

    public Tresure(int coins) {
        this.coins = coins;
    }

    public void action(ArrayList<Player> players){
        int numOfPlayers = players.size();
        double total = (double)this.coins/numOfPlayers;
        for(Player player : players){
            player.addCoins(total);
        }
    }
}
