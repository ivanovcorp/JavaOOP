package Task_06_FootballTeamGenerator;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by ivano on 2/13/2017.
 */
public class FootballTeam {
    private List<Player> teamPlayers;
    private String name;
    private int rating;

    public FootballTeam(String name) {
        this.name = name;
        this.teamPlayers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (!name.equals("") && !name.equals(" ")) {
            this.name = name;
        } else {
            throw new NumberFormatException("A name should not be empty.");
        }
    }

    public void addPlayer(Player player) {
        this.teamPlayers.add(player);
    }

    public int getTeamRating() {
        if (teamPlayers.size() > 0) {
            int sum = 0;
            for (int i = 0; i < this.teamPlayers.size(); i++) {
                sum += teamPlayers.get(i).getPlayerRating();
            }

            return sum / teamPlayers.size();
        }
        return 0;
    }

    public List<Player> getTeamPlayers() {
        return this.teamPlayers;
    }
}
