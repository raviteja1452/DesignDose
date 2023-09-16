package tollManagement.entities;

import java.util.ArrayList;
import java.util.List;

public class TollLeaderBoard {
    private String leaderBoardId;
    private String name;
    private List<TollBooth> tollBooths;

    public TollLeaderBoard(String leaderBoardId, String name) {
        this.leaderBoardId = leaderBoardId;
        this.name = name;
        this.tollBooths = new ArrayList<>();
    }

    public void addTollBoothToLeaderBoard(TollBooth tollBooth) {
        tollBooths.add(tollBooth);
    }

    public void removeTollBoothToLeaderBoard(TollBooth tollBooth) {
        tollBooths.remove(tollBooth);
    }

    public void listTheTolls() {
        for(TollBooth tollBooth: tollBooths) {
            System.out.println(tollBooth);
        }
    }

}
