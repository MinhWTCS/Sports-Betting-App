import javax.swing.*;
import java.awt.*;

public class TournamentBracket extends JPanel {
    public TournamentBracket() {
        setLayout(new GridLayout(1, 3)); // Split into three columns

        // Left side
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(4, 1));
        leftPanel.add(createMatchPanel("Belgium", "Portugal"));
        leftPanel.add(createMatchPanel("Germany", "Croatia"));
        leftPanel.add(createMatchPanel("France", "Spain"));
        leftPanel.add(createMatchPanel("England", "Italy"));

        // Center panel (logo)
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        JLabel logo = new JLabel("EURO 2024", JLabel.CENTER);
        logo.setFont(new Font("Arial", Font.BOLD, 24));
        centerPanel.add(logo, BorderLayout.CENTER);

        // Empty panel to balance the GridLayout
        JPanel emptyPanel = new JPanel();

        add(leftPanel);
        add(centerPanel);
        add(emptyPanel);
    }

    private JPanel createMatchPanel(String team1, String team2) {
        JPanel panel = new JPanel(new GridLayout(2, 1));
        JButton team1Button = new JButton(team1);
        JButton team2Button = new JButton(team2);

        team1Button.addActionListener(e -> placeBet(team1));
        team2Button.addActionListener(e -> placeBet(team2));

        panel.add(team1Button);
        panel.add(team2Button);
        return panel;
    }

    private void placeBet(String team) {
        double userBalance = BettingUtils.userBalance;
        double probability = BettingUtils.teamsProbabilities.get(team);
        double betAmount = BettingUtils.getBetAmount();
        double winnings = betAmount * probability;
        userBalance += winnings - betAmount;
        BettingUtils.userBalance = userBalance;
        JOptionPane.showMessageDialog(this, "You bet $" + betAmount + " on " + team + ".\nYour winnings: $" + winnings + "\nNew Balance: $" + userBalance);

        // After placing a bet on a team, prompt to bet on a player
        String[] options = BettingUtils.getPlayerNames(team);
        String selectedPlayer = (String) JOptionPane.showInputDialog(null, "Choose a player to bet on:", "Player Performance Bet",
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (selectedPlayer != null) {
            BettingUtils.betOnPlayerPerformance(selectedPlayer);
        }
    }
}

