package collectionsjune24;
import java.util.*;
public class HotPotatoGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Create a queue to represent the circle of players
        Queue<String> players = new LinkedList<>();

        // Enqueue player names
        System.out.println("Enter the number of players:");
        int numberOfPlayers = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.println("Enter the name of player " + i + ":");
            String playerName = scanner.nextLine();
            players.add(playerName);
        }

        System.out.println("Enter the number of passes for each round:");
        int passes = scanner.nextInt();

        // Simulate passing the potato and eliminating players
        while (players.size() > 1) {
            // Pass the potato
            for (int i = 0; i < passes; i++) {
                // Dequeue the player at the front and enqueue them again
                String player = players.remove();
                players.add(player);
            }

            // Remove the player holding the potato when the music stops
            String eliminatedPlayer = players.remove();
            System.out.println(eliminatedPlayer + " is out.");
        }

        // The last remaining player
        String winner = players.remove();
        System.out.println("The winner is " + winner + "!");

	}

}
