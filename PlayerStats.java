public class PlayerStats {
    private double goalsProbability;
    private double touchesProbability;
    private double passesProbability;
    private int[] goalsRange;
    private int[] touchesRange;
    private int[] passesRange;
    public PlayerStats(double goalsProbability, double touchesProbability, int[] goalsRange, int[] touchesRange, int[] passesRange) {
        this.goalsProbability = goalsProbability;
        this.touchesProbability = touchesProbability;
        this.passesProbability = passesProbability;
        this.goalsRange = goalsRange;
        this.touchesRange = touchesRange;
        this.passesRange = passesRange;
    }
    
    public double getGoalsProbability() {
        return goalsProbability;
    }
    
    public double getTouchesProbability() {
        return touchesProbability;
    }
    
    public double getPassesProbability() {
        return passesProbability;
    }
    
    public int[] getGoalsRange() {
        return goalsRange;
    }
    
    public int[] getTouchesRange() {
        return touchesRange;
    }
    
    public int[] getPassesRange() {
        return passesRange;
    }
}    