public class PlayerStats {
    public double probabilityToScore1Goal;
    public double probabilityToScore2Goals;
    public int[] touchesRange;
    public int[] passesRange;

    public PlayerStats(double probabilityToScore1Goal, double probabilityToScore2Goals, int[] touchesRange, int[] passesRange) {
        this.probabilityToScore1Goal = probabilityToScore1Goal;
        this.probabilityToScore2Goals = probabilityToScore2Goals;
        this.touchesRange = touchesRange;
        this.passesRange = passesRange;
    }
}
