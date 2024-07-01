package Dream11.serivce;

import Dream11.pojo.User;
import Dream11.pojo.UserTeam;

public class UserService {

    private ContestService contestService;

    //Crud on user
    public void createUser(){

    }

    //join contest
    public boolean joinContest(User user, UserTeam userTeam, String contestId){
        //validate userTeam

        //joinContest
        return contestService.joinContest(userTeam,contestId);
    }
}
