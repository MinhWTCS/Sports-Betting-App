import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Euro 2024 Betting");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1200, 800);
            frame.setLayout(new BorderLayout());

            TournamentBracket bracket = new TournamentBracket();
            frame.add(bracket, BorderLayout.CENTER);

            frame.setVisible(true);
        });
    }
}