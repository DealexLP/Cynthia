package net.cynthia.roulette.objects;

public class Player {

    private final String name;
    private int deads;
    private int shots;

    public Player(final String name) {
        this.name = name;
        this.deads = 0;
        this.shots = 0;
    }

    public void addDead(final int shots) {
        this.deads++;
        this.shots += shots;
    }

    @Override
    public String toString() {
        return this.name + " (" + deads + " | " + this.shots + ")";
    }
}