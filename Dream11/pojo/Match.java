package Dream11.pojo;

import java.util.List;

public class Match {
     private List<Team> teamList;
     private List<MatchPlayer> playerList;
     private List<Contest> contestList;
     private SportType sportType;
    private boolean matchStarted;

    public List<Contest> getContestList() {
        return contestList;
    }

    public SportType getSportType() {
        return sportType;
    }

    public boolean isMatchStarted() {
        return matchStarted;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }

    public List<MatchPlayer> getPlayerList() {
        return playerList;
    }
}
