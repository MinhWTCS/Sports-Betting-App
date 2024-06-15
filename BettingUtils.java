import javax.swing.*;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

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
        playersStats.put("Cristiano Ronaldo", new PlayerStats(0.25, 0.10, new int[]{30, 50}, new int[]{20, 40}));
        playersStats.put("João Félix", new PlayerStats(0.15, 0.05, new int[]{25, 45}, new int[]{15, 35}));
        playersStats.put("Bruno Fernandes", new PlayerStats(0.12, 0.04, new int[]{20, 40}, new int[]{10, 30}));
        playersStats.put("Bernardo Silva", new PlayerStats(0.10, 0.03, new int[]{18, 38}, new int[]{8, 28}));
        playersStats.put("Diogo Jota", new PlayerStats(0.18, 0.08, new int[]{22, 42}, new int[]{12, 32}));
        playersStats.put("André Silva", new PlayerStats(0.15, 0.07, new int[]{20, 40}, new int[]{10, 30}));
        playersStats.put("Rui Patricio", new PlayerStats(0.0, 0.0, new int[]{0, 0}, new int[]{0, 0}));

        playersStats.put("Luka Modric", new PlayerStats(0.18, 0.05, new int[]{28, 45}, new int[]{20, 35}));
        playersStats.put("Ivan Perišić", new PlayerStats(0.14, 0.03, new int[]{25, 40}, new int[]{15, 30}));
        playersStats.put("Andrej Kramarić", new PlayerStats(0.12, 0.02, new int[]{22, 38}, new int[]{12, 28}));
        playersStats.put("Ante Rebić", new PlayerStats(0.16, 0.06, new int[]{26, 42}, new int[]{18, 32}));
        playersStats.put("Josip Brekalo", new PlayerStats(0.10, 0.01, new int[]{20, 35}, new int[]{10, 25}));
        playersStats.put("Luka Ivanušec", new PlayerStats(0.08, 0.0, new int[]{18, 32}, new int[]{8, 20}));
        playersStats.put("Domagoj Vida", new PlayerStats(0.05, 0.0, new int[]{15, 30}, new int[]{5, 18}));

        playersStats.put("Kylian Mbappé", new PlayerStats(0.30, 0.12, new int[]{35, 55}, new int[]{25, 45}));
        playersStats.put("Antoine Griezmann", new PlayerStats(0.20, 0.08, new int[]{30, 50}, new int[]{20, 40}));
        playersStats.put("Karim Benzema", new PlayerStats(0.25, 0.10, new int[]{32, 52}, new int[]{22, 42}));
        playersStats.put("Olivier Giroud", new PlayerStats(0.15, 0.05, new int[]{28, 45}, new int[]{18, 35}));
        playersStats.put("Kingsley Coman", new PlayerStats(0.18, 0.06, new int[]{30, 48}, new int[]{20, 38}));
        playersStats.put("Raphael Varane", new PlayerStats(0.05, 0.0, new int[]{18, 32}, new int[]{8, 20}));
        playersStats.put("Hugo Lloris", new PlayerStats(0.0, 0.0, new int[]{0, 0}, new int[]{0, 0}));

        playersStats.put("Harry Kane", new PlayerStats(0.28, 0.12, new int[]{32, 50}, new int[]{22, 40}));
        playersStats.put("Raheem Sterling", new PlayerStats(0.20, 0.08, new int[]{28, 45}, new int[]{18, 35}));
        playersStats.put("Marcus Rashford", new PlayerStats(0.18, 0.06, new int[]{25, 42}, new int[]{15, 32}));
        playersStats.put("Jadon Sancho", new PlayerStats(0.22, 0.09, new int[]{30, 48}, new int[]{20, 38}));
        playersStats.put("Mason Mount", new PlayerStats(0.15, 0.05, new int[]{28, 45}, new int[]{18, 35}));
        playersStats.put("Trent Alexander-Arnold", new PlayerStats(0.10, 0.02, new int[]{22, 38}, new int[]{12, 28}));
        playersStats.put("Jordan Pickford", new PlayerStats(0.0, 0.0, new int[]{0, 0}, new int[]{0, 0}));

        playersStats.put("Timo Werner", new PlayerStats(0.22, 0.08, new int[]{28, 45}, new int[]{18, 35}));
        playersStats.put("Serge Gnabry", new PlayerStats(0.18, 0.06, new int[]{25, 42}, new int[]{15, 32}));
        playersStats.put("Kai Havertz", new PlayerStats(0.20, 0.07, new int[]{30, 48}, new int[]{20, 38}));
        playersStats.put("Thomas Müller", new PlayerStats(0.15, 0.05, new int[]{28, 45}, new int[]{18, 35}));
        playersStats.put("Leroy Sané", new PlayerStats(0.18, 0.06, new int[]{30, 48}, new int[]{20, 38}));
        playersStats.put("Manuel Neuer", new PlayerStats(0.0, 0.0, new int[]{0, 0}, new int[]{0, 0}));
        playersStats.put("Joshua Kimmich", new PlayerStats(0.10, 0.03, new int[]{22, 38}, new int[]{12, 28}));

        playersStats.put("Romelu Lukaku", new PlayerStats(0.25, 0.10, new int[]{30, 50}, new int[]{20, 40}));
        playersStats.put("Kevin De Bruyne", new PlayerStats(0.20, 0.08, new int[]{28, 45}, new int[]{18, 35}));
        playersStats.put("Eden Hazard", new PlayerStats(0.22, 0.09, new int[]{32, 52}, new int[]{22, 42}));
        playersStats.put("Thorgan Hazard", new PlayerStats(0.18, 0.06, new int[]{28, 45}, new int[]{18, 35}));
        playersStats.put("Dries Mertens", new PlayerStats(0.15, 0.05, new int[]{25, 42}, new int[]{15, 32}));
        playersStats.put("Axel Witsel", new PlayerStats(0.10, 0.03, new int[]{22, 38}, new int[]{12, 28}));
        playersStats.put("Thibaut Courtois", new PlayerStats(0.0, 0.0, new int[]{0, 0}, new int[]{0, 0}));

        playersStats.put("Gerard Moreno", new PlayerStats(0.20, 0.07, new int[]{28, 45}, new int[]{18, 35}));
        playersStats.put("Álvaro Morata", new PlayerStats(0.18, 0.06, new int[]{25, 42}, new int[]{15, 32}));
        playersStats.put("Ferran Torres", new PlayerStats(0.22, 0.08, new int[]{30, 48}, new int[]{20, 38}));
        playersStats.put("Pablo Sarabia", new PlayerStats(0.15, 0.05, new int[]{28, 45}, new int[]{20, 38}));
        playersStats.put("Ferran Torres", new PlayerStats(0.15, 0.05, new int[]{18, 35}, new int[]{10, 25}));
        playersStats.put("Dani Olmo", new PlayerStats(0.12, 0.04, new int[]{15, 32}, new int[]{8, 20}));
        playersStats.put("Unai Simón", new PlayerStats(0.0, 0.0, new int[]{0, 0}, new int[]{0, 0}));

        playersStats.put("Ciro Immobile", new PlayerStats(0.25, 0.10, new int[]{30, 50}, new int[]{20, 40}));
        playersStats.put("Lorenzo Insigne", new PlayerStats(0.18, 0.06, new int[]{28, 45}, new int[]{18, 35}));
        playersStats.put("Federico Chiesa", new PlayerStats(0.20, 0.08, new int[]{32, 52}, new int[]{22, 42}));
        playersStats.put("Andrea Belotti", new PlayerStats(0.15, 0.05, new int[]{25, 42}, new int[]{15, 32}));
        playersStats.put("Stephan El Shaarawy", new PlayerStats(0.18, 0.07, new int[]{28, 45}, new int[]{18, 35}));
        playersStats.put("Lorenzo Pellegrini", new PlayerStats(0.10, 0.03, new int[]{22, 38}, new int[]{12, 28}));
        playersStats.put("Gianluigi Donnarumma", new PlayerStats(0.0, 0.0, new int[]{0, 0}, new int[]{0, 0}));
    }
    
