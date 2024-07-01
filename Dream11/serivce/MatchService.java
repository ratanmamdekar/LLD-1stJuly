package Dream11.serivce;

import Dream11.pojo.MatchPlayer;

public class MatchService {

    public void updatePlayerPoints(MatchPlayer matchPlayer, int points){
        matchPlayer.increasePoints(points);
    }
}
