import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Initialize your GUI or application components
        JFrame frame = new JFrame("Soccer Betting App");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        // Create and add tournament bracket panel
        TournamentBracket bracket = new TournamentBracket();
        frame.add(bracket);
    
        // Start playing background music
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.playMusic("C:\\Users\\imfer\\OneDrive\\Desktop\\Coding Class\\SoccerBettingApp.java\\src\\music/정국 Jung Kook (of BTS) featuring Fahad Al Kubaisi - Dreamers  FIFA World Cup 2022 Soundtrack.wav");
    
        // Show the frame
        frame.setVisible(true);
    }
}