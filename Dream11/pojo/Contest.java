package Dream11.pojo;

import java.util.ArrayList;
import java.util.List;



public class Contest {
    private String contestId;
    private Match match;
     private boolean contestStarted = false;

    public String getContestId() {
        return contestId;
    }

    public Match getMatch() {
        return match;
    }

    public boolean isContestStarted() {
        return contestStarted;
    }

    public Leaderboard getLeaderboard() {
        return leaderboard;
    }

    public List<UserTeam> getUserTeamList() {
        return userTeamList;
    }

//    private Leaderboard leaderboard = new Leaderboard();
     private List<UserTeam> userTeamList = new ArrayList<>();


}
