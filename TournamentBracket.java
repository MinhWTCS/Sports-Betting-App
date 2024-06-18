import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class TournamentBracket extends JPanel {
    private List<String> teams = new ArrayList<>();

public TournamentBracket() {
    teams.add("Portugal");
    teams.add("Croatia");
    teams.add("France");
    teams.add("England");
    teams.add("Germany");
    teams.add("Belgium");
    teams.add("Spain");
    teams.add("Italy");

    // Randomize teams for each new game
    Collections.shuffle(teams);

    setLayout(new GridLayout(4, 2));

    for (int i = 0; i < teams.size(); i += 2) {
        JButton matchButton = new JButton(teams.get(i) + " vs " + teams.get(i + 1));
        matchButton.addActionListener(new MatchButtonListener());
        add(matchButton);
    }
}

private class MatchButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        String[] teamsPlaying = source.getText().split(" vs ");
        String team1 = teamsPlaying[0];
        String team2 = teamsPlaying[1];

        String selectedOption = (String) JOptionPane.showInputDialog(null,
                "Choose what you want to bet on:",
                "Bet Option",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{"Match Winner", "Player Performance"},
                "Match Winner");

        if (selectedOption != null) {
            if (selectedOption.equals("Match Winner")) {
                String selectedTeam = (String) JOptionPane.showInputDialog(null,
                        "Choose the team you want to bet on:",
                        "Bet on Team",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        new String[]{team1, team2},
                        team1);

                if (selectedTeam != null) {
                    String amountStr = JOptionPane.showInputDialog("Enter the amount you want to bet:");
                    double amount = Double.parseDouble(amountStr);
                    BettingUtils.betOnMatchWinner(selectedTeam, amount);
                }
            } else if (selectedOption.equals("Player Performance")) {
                String selectedTeam = (String) JOptionPane.showInputDialog(null,
                        "Choose the team you want to bet on:",
                        "Bet on Team",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        new String[]{team1, team2},
                        team1);

                if (selectedTeam != null) {
                    String[] players = getPlayersFromTeam(selectedTeam);

                    String selectedPlayer = (String) JOptionPane.showInputDialog(null,
                            "Choose the player you want to bet on:",
                            "Bet on Player",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            players,
                            players[0]);

                    if (selectedPlayer != null) {
                        String metric = (String) JOptionPane.showInputDialog(null,
                                "Choose what you want to bet on:",
                                "Bet Option",
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                new String[]{"Goals", "Touches", "Passes"},
                                "Goals");

                        if (metric != null) {
                            String amountStr = JOptionPane.showInputDialog("Enter the amount you want to bet:");
                            double amount = Double.parseDouble(amountStr);

                            int goals = 0, touches = 0, passes = 0;

                            switch (metric) {
                                case "Goals":
                                    String goalsStr = JOptionPane.showInputDialog("Enter the number of goals:");
                                    goals = Integer.parseInt(goalsStr);
                                    break;
                                case "Touches":
                                    String touchesStr = JOptionPane.showInputDialog("Enter the number of touches:");
                                    touches = Integer.parseInt(touchesStr);
                                    break;
                                case "Passes":
                                    String passesStr = JOptionPane.showInputDialog("Enter the number of passes:");
                                    passes = Integer.parseInt(passesStr);
                                    break;
                            }

                            BettingUtils.betOnPlayerPerformance(selectedPlayer, goals, touches, passes, amount);
                        }
                    }
                }
            }
        }
    }

    // Helper method to get players from selected team
    private String[] getPlayersFromTeam(String selectedTeam) {
        List<String> players = new ArrayList<>();
        for (String player : BettingUtils.playersStats.keySet()) {
            if (player.startsWith(selectedTeam)) {
                players.add(player);
            }
        }
        return players.toArray(new String[0]);
    }
}

public static void main(String[] args) {
    JFrame frame = new JFrame("Tournament Bracket");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 400);
    TournamentBracket tournamentBracket = new TournamentBracket();
    frame.add(tournamentBracket);
    frame.setVisible(true);
}
}