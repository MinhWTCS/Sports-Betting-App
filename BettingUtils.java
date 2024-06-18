import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class BettingUtils {
public static double userBalance = 1000.0;
public static final Map<String, Double> teamsProbabilities = new HashMap<>();
public static final Map<String, PlayerStats> playersStats = new HashMap<>();
static {
    initializeData();
}

public static void initializeData() {
    // Initialize teams and their winning probabilities
    teamsProbabilities.put("Portugal", 0.12);
    teamsProbabilities.put("Croatia", 0.08);
    teamsProbabilities.put("France", 0.20);
    teamsProbabilities.put("England", 0.15);
    teamsProbabilities.put("Germany", 0.10);
    teamsProbabilities.put("Belgium", 0.18);
    teamsProbabilities.put("Spain", 0.10);
    teamsProbabilities.put("Italy", 0.07);

    // Initialize players and their statistics
      // Portugal players
    playersStats.put("Cristiano Ronaldo", new PlayerStats(0.9, 0.9, new int[]{100, 200}, new int[]{50, 100}, new int[]{30, 50}));
    playersStats.put("João Félix", new PlayerStats(0.15, 0.05, new int[]{25, 45}, new int[]{15, 35}, new int[]{5, 20}));
    playersStats.put("Bruno Fernandes", new PlayerStats(0.12, 0.04, new int[]{20, 40}, new int[]{10, 30}, new int[]{3, 15}));
    playersStats.put("Bernardo Silva", new PlayerStats(0.10, 0.03, new int[]{18, 38}, new int[]{8, 28}, new int[]{2, 12}));
    playersStats.put("Diogo Jota", new PlayerStats(0.18, 0.08, new int[]{22, 42}, new int[]{12, 32}, new int[]{4, 18}));
    playersStats.put("André Silva", new PlayerStats(0.15, 0.07, new int[]{20, 40}, new int[]{10, 30}, new int[]{3, 15}));
    playersStats.put("Rui Patricio", new PlayerStats(0.0, 0.0, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}));
      // Croatia players
    playersStats.put("Luka Modric", new PlayerStats(0.18, 0.05, new int[]{28, 45}, new int[]{20, 35}, new int[]{5, 18}));
    playersStats.put("Ivan Perišić", new PlayerStats(0.14, 0.03, new int[]{25, 40}, new int[]{15, 30}, new int[]{3, 12}));
    playersStats.put("Andrej Kramarić", new PlayerStats(0.12, 0.02, new int[]{22, 38}, new int[]{12, 28}, new int[]{2, 10}));
    playersStats.put("Ante Rebić", new PlayerStats(0.16, 0.06, new int[]{26, 42}, new int[]{18, 32}, new int[]{4, 15}));
    playersStats.put("Josip Brekalo", new PlayerStats(0.10, 0.01, new int[]{20, 35}, new int[]{10, 25}, new int[]{1, 8}));
    playersStats.put("Luka Ivanušec", new PlayerStats(0.08, 0.0, new int[]{18, 32}, new int[]{8, 20}, new int[]{0, 5}));
    playersStats.put("Domagoj Vida", new PlayerStats(0.05, 0.0, new int[]{15, 30}, new int[]{5, 18}, new int[]{0, 3}));

      // France players
    playersStats.put("Kylian Mbappé", new PlayerStats(0.30, 0.12, new int[]{35, 55}, new int[]{25, 45}, new int[]{18, 40}));
    playersStats.put("Antoine Griezmann", new PlayerStats(0.20, 0.08, new int[]{30, 50}, new int[]{20, 40}, new int[]{15, 30}));
    playersStats.put("Karim Benzema", new PlayerStats(0.25, 0.10, new int[]{32, 52}, new int[]{22, 42}, new int[]{12, 35}));
    playersStats.put("Olivier Giroud", new PlayerStats(0.15, 0.05, new int[]{28, 45}, new int[]{18, 35}, new int[]{10, 25}));
    playersStats.put("Kingsley Coman", new PlayerStats(0.18, 0.06, new int[]{30, 48}, new int[]{20, 38}, new int[]{12, 30}));
    playersStats.put("Raphael Varane", new PlayerStats(0.05, 0.0, new int[]{18, 32}, new int[]{8, 20}, new int[]{0, 5}));
    playersStats.put("Hugo Lloris", new PlayerStats(0.0, 0.0, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}));

      // England players
    playersStats.put("Harry Kane", new PlayerStats(0.28, 0.12, new int[]{32, 50}, new int[]{22, 40}, new int[]{15, 35}));
    playersStats.put("Raheem Sterling", new PlayerStats(0.20, 0.08, new int[]{28, 45}, new int[]{18, 35}, new int[]{10, 25}));
    playersStats.put("Marcus Rashford", new PlayerStats(0.18, 0.06, new int[]{25, 42}, new int[]{15, 32}, new int[]{8, 22}));
    playersStats.put("Jadon Sancho", new PlayerStats(0.22, 0.09, new int[]{30, 48}, new int[]{20, 38}, new int[]{12, 30}));
    playersStats.put("Mason Mount", new PlayerStats(0.15, 0.05, new int[]{28, 45}, new int[]{18, 35}, new int[]{10, 25}));
    playersStats.put("Trent Alexander-Arnold", new PlayerStats(0.10, 0.02, new int[]{22, 38}, new int[]{12, 28}, new int[]{5, 15}));
    playersStats.put("Jordan Pickford", new PlayerStats(0.0, 0.0, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}));

      // Germany players
    playersStats.put("Timo Werner", new PlayerStats(0.22, 0.08, new int[]{28, 45}, new int[]{18, 35}, new int[]{10, 25}));
    playersStats.put("Serge Gnabry", new PlayerStats(0.18, 0.06, new int[]{25, 42}, new int[]{15, 32}, new int[]{8, 20}));
    playersStats.put("Kai Havertz", new PlayerStats(0.20, 0.07, new int[]{30, 48}, new int[]{20, 38}, new int[]{12, 30}));
    playersStats.put("Thomas Müller", new PlayerStats(0.15, 0.05, new int[]{28, 45}, new int[]{18, 35}, new int[]{10, 25}));
    playersStats.put("Leroy Sané", new PlayerStats(0.18, 0.06, new int[]{30, 48}, new int[]{20, 38}, new int[]{12, 30}));
    playersStats.put("Manuel Neuer", new PlayerStats(0.0, 0.0, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}));
    playersStats.put("Joshua Kimmich", new PlayerStats(0.10, 0.03, new int[]{22, 38}, new int[]{12, 28}, new int[]{5, 15}));

      // Belgium players
    playersStats.put("Romelu Lukaku", new PlayerStats(0.25, 0.10, new int[]{30, 50}, new int[]{20, 40}, new int[]{12, 32}));
    playersStats.put("Kevin De Bruyne", new PlayerStats(0.20, 0.08, new int[]{28, 45}, new int[]{18, 35}, new int[]{10, 28}));
    playersStats.put("Eden Hazard", new PlayerStats(0.22, 0.09, new int[]{32, 52}, new int[]{22, 42}, new int[]{15, 35}));
    playersStats.put("Thorgan Hazard", new PlayerStats(0.18, 0.06, new int[]{28, 45}, new int[]{18, 35}, new int[]{8, 25}));
    playersStats.put("Dries Mertens", new PlayerStats(0.15, 0.05, new int[]{25, 42}, new int[]{15, 32}, new int[]{5, 20}));
    playersStats.put("Axel Witsel", new PlayerStats(0.10, 0.03, new int[]{22, 38}, new int[]{12, 28}, new int[]{3, 15}));

    // Spain players
    playersStats.put("Gerard Moreno", new PlayerStats(0.20, 0.07, new int[]{28, 45}, new int[]{18, 35}, new int[]{10, 28}));
    playersStats.put("Álvaro Morata", new PlayerStats(0.18, 0.06, new int[]{25, 42}, new int[]{15, 32}, new int[]{8, 25}));
    playersStats.put("Ferran Torres", new PlayerStats(0.22, 0.08, new int[]{30, 48}, new int[]{20, 38}, new int[]{12, 30}));
    playersStats.put("Pablo Sarabia", new PlayerStats(0.15, 0.05, new int[]{28, 45}, new int[]{20, 38}, new int[]{10, 25}));
    playersStats.put("Dani Olmo", new PlayerStats(0.12, 0.04, new int[]{15, 32}, new int[]{8, 20}, new int[]{3, 12}));
    playersStats.put("Unai Simón", new PlayerStats(0.0, 0.0, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}));

// Italy players
    playersStats.put("Ciro Immobile", new PlayerStats(0.25, 0.10, new int[]{30, 50}, new int[]{20, 40}, new int[]{12, 32}));
    playersStats.put("Lorenzo Insigne", new PlayerStats(0.18, 0.06, new int[]{28, 45}, new int[]{18, 35}, new int[]{10, 28}));
    playersStats.put("Federico Chiesa", new PlayerStats(0.20, 0.08, new int[]{32, 52}, new int[]{22, 42}, new int[]{15, 35}));
    playersStats.put("Andrea Belotti", new PlayerStats(0.15, 0.05, new int[]{25, 42}, new int[]{15, 32}, new int[]{8, 25}));
    playersStats.put("Stephan El Shaarawy", new PlayerStats(0.18, 0.07, new int[]{28, 45}, new int[]{18, 35}, new int[]{10, 28}));
    playersStats.put("Lorenzo Pellegrini", new PlayerStats(0.10, 0.03, new int[]{22, 38}, new int[]{12, 28}, new int[]{5, 15}));
    playersStats.put("Gianluigi Donnarumma", new PlayerStats(0.0, 0.0, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}));}
// Bet on the winner of a match
public static void betOnMatchWinner(String teamName, double amount) {
    if (!teamsProbabilities.containsKey(teamName)) {
        System.out.println("Team " + teamName + " is not participating in the tournament.");
        return;
    }

    double winningProbability = teamsProbabilities.get(teamName);
    double potentialWinnings = amount * (1.0 / winningProbability);

    if (userBalance >= amount) {
        userBalance -= amount;
        System.out.println("You bet $" + amount + " on " + teamName + " to win.");
        System.out.println("If " + teamName + " wins, you will receive $" + potentialWinnings + ".");
    } else {
        System.out.println("Insufficient balance to place the bet.");
    }
}

// Bet on a player's performance metrics
public static void betOnPlayerPerformance(String selectedPlayer2, int goals2, int touches2, int passes2, double amount2) {
    String selectedPlayer = (String) JOptionPane.showInputDialog(
            null,
            "Choose the player you want to bet on:",
            "Bet on Player",
            JOptionPane.QUESTION_MESSAGE,
            null,
            playersStats.keySet().toArray(),
            playersStats.keySet().toArray()[0]);  // Default selection (first player)

    if (selectedPlayer != null) {
        PlayerStats playerStats = playersStats.get(selectedPlayer);

        // Get user input for goals
        String goalsInput = JOptionPane.showInputDialog("Enter the number of goals (between " + playerStats.getGoalsRange()[0] + " and " + playerStats.getGoalsRange()[1] + "):");
        int goals = Integer.parseInt(goalsInput);

        // Get user input for touches
        String touchesInput = JOptionPane.showInputDialog("Enter the number of touches (between " + playerStats.getTouchesRange()[0] + " and " + playerStats.getTouchesRange()[1] + "):");
        int touches = Integer.parseInt(touchesInput);

        // Get user input for passes
        String passesInput = JOptionPane.showInputDialog("Enter the number of passes (between " + playerStats.getPassesRange()[0] + " and " + playerStats.getPassesRange()[1] + "):");
        int passes = Integer.parseInt(passesInput);

        // Get user input for amount
        String amountInput = JOptionPane.showInputDialog("Enter the bet amount:");
        double amount = Double.parseDouble(amountInput);

        double goalsProbability = playerStats.getGoalsProbability();
        double touchesProbability = playerStats.getTouchesProbability();
        double passesProbability = playerStats.getPassesProbability();

        double potentialWinnings = calculatePotentialWinnings(goals, touches, passes, goalsProbability, touchesProbability, passesProbability, amount);

        if (userBalance >= amount) {
            userBalance -= amount;
            System.out.println("You bet $" + amount + " on " + selectedPlayer + "'s performance:");
            System.out.println("Goals: " + goals + " (Expected: " + playerStats.getGoalsRange()[0] + " - " + playerStats.getGoalsRange()[1] + ")");
            System.out.println("Touches: " + touches + " (Expected: " + playerStats.getTouchesRange()[0] + " - " + playerStats.getTouchesRange()[1] + ")");
            System.out.println("Passes: " + passes + " (Expected: " + playerStats.getPassesRange()[0] + " - " + playerStats.getPassesRange()[1] + ")");
            System.out.println("If the performance matches, you will receive $" + potentialWinnings + ".");
        } else {
            System.out.println("Insufficient balance to place the bet.");
        }
    } else {
        System.out.println("No player selected. Bet canceled.");
    }
}

// Helper method to calculate potential winnings based on player's performance
private static double calculatePotentialWinnings(int goals, int touches, int passes,
    double goalsProbability, double touchesProbability, double passesProbability,
    double amount) {
    double winnings = 0;
    DecimalFormat df = new DecimalFormat("#.##");

    // Example calculation, replace with your actual logic
    winnings += goals * amount * goalsProbability;
    winnings += touches * amount * touchesProbability;
    winnings += passes * amount * passesProbability;

    return Double.parseDouble(df.format(winnings));}
    }
    