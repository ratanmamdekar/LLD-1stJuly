package Dream11.pojo;

public class MatchPlayer {
    private Match match;
    private Player player;
    private int points;

    public Match getMatch() {
        return match;
    }

    public Player getPlayer() {
        return player;
    }

    public int getPoints() {
        return points;
    }

    public void increasePoints(int points){
        this.points+=points;
    }
}
