package Dream11.pojo;

import java.util.List;

public class UserTeam {

    private String id;
    private String name;
    List<Player> playerList;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }
}
