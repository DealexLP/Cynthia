package net.cynthia.roulette.manager;

import net.cynthia.roulette.objects.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerManager {

    private final List<Player> players;

    public PlayerManager() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(final Player player) {
        this.players.add(player);
    }

    public List<Player> getPlayers() {
        return players;
    }
}