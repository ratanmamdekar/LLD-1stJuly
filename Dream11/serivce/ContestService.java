package Dream11.serivce;

import Dream11.pojo.Contest;
import Dream11.pojo.Match;
import Dream11.pojo.UserTeam;

import java.util.UUID;

public class ContestService {

    //creating contest
    public Contest createContest(String matchId){
        Match match= new Match();
        Contest contest= new Contest(UUID.randomUUID().toString(),match);
        match.getContestList().add(contest);
        return contest;
    }


    public boolean joinContest(UserTeam userTeam, String contestId){

        Contest contest = new Contest();// contest repository


        // return false if contest started
        if(contest.isContestStarted()){
            return false;
        }

        contest.getUserTeamList().add(userTeam);
        return true;
    }

}
