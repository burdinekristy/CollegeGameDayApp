package gameday.teams;

import java.util.ArrayList;
import java.util.List;

public class TeamManager {
    private List<Team> teams = new ArrayList<>();

    public TeamManager() {
        loadTeams();
    }

    private void loadTeams() {
        teams.add(new Team("Alabama", "Crimson Tide", "SEC", 1));
        teams.add(new Team("Ohio State", "Buckeyes", "Big Ten", 2));
        teams.add(new Team("Georgia", "Bulldogs", "SEC", 3));
        teams.add(new Team("Michigan", "Wolverines", "Big Ten", 4));
        teams.add(new Team("Texas", "Longhorns", "Big 12", 5));
    }

    public List<Team> getTeams() {
        return teams;
    }

    public Team getTeamByName(String name) {
        for (Team team : teams) {
            if (team.getName().equalsIgnoreCase(name)) {
                return team;
            }
        }
        return null;
    }
}