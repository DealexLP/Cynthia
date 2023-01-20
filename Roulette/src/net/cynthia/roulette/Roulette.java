package net.cynthia.roulette;

import net.cynthia.roulette.manager.PlayerManager;
import net.cynthia.roulette.objects.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Roulette {

    public static void main(String[] args) throws IOException {
        final PlayerManager playerManager = new PlayerManager();
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bitte Spieler nacheinander angeben. Wenn fertig q tippen");

        String inputString = "";
        while ((inputString = bufferedReader.readLine()) != null && (!inputString.equalsIgnoreCase("q"))) {
            final Player player = new Player(inputString);
            playerManager.addPlayer(player);
            System.out.println(inputString + " wurde hinzugefügt!");
        }

        System.out.println("Spiel startet...");

        boolean running = true;

        while(running) {
            for(Player player : playerManager.getPlayers()) {
                System.out.println(player + " ist dran.");
                String input = bufferedReader.readLine();

                if(input.equalsIgnoreCase("q")) {
                    running = false;
                }

                final Random random = new Random();
                int value = random.nextInt(6);

                if (value == 0) {
                    int shots = random.nextInt(10) + 1;
                    System.out.println("Du wurdest getroffen (" + shots + " Schlücke).");
                    player.addDead(shots);
                } else {
                    System.out.println("Du hast glück gehabt du pussy!");
                }

                System.out.println("Dein Zug ist beendet!\n\n\n");
            }
        }
    }
}