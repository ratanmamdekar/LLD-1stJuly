package Dream11.serivce;

import Dream11.pojo.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RankingService {

    public void buildRanking(Contest contest){
        List<UserTeam> userTeamList = contest.getUserTeamList();
        List<MatchPlayer> playerList = contest.getMatch().getPlayerList();

        Map<String,Integer> matchPoints = getMatchPoints(userTeamList,playerList);

        userTeamList.sort((userTeamA,userTeamB)->{
            Integer userAPoints = matchPoints.get(userTeamA.getId());
            Integer userBPoints = matchPoints.get(userTeamA.getId());

            return userBPoints.compareTo(userAPoints);
        });
    }

    private Map<String, Integer> getMatchPoints(List<UserTeam> userTeamList, List<MatchPlayer> playerList) {
        Map<String,Integer> matchPoints = new HashMap<>();
        Map<Player, Integer> playerPoints = playerList.stream().collect(Collectors.toMap(MatchPlayer::getPlayer, MatchPlayer::getPoints));
        for (UserTeam userTeam : userTeamList){
            String userTeamId = userTeam.getId();
            int point = getUserTeamPoints(userTeam.getPlayerList(),playerPoints);
            matchPoints.put(userTeamId,point);
        }

        return matchPoints;
    }

    private int getUserTeamPoints(List<Player> playerList, Map<Player, Integer> playerPoints) {
        int points =0;

        for(Player player :playerList){
            points += playerPoints.getOrDefault(player,0);
        }

        return points;
    }
}
