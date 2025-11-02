package gameday.teams;

public class Team {
    private String name;
    private String mascot;
    private String conference;
    private int ranking;

    public Team(String name, String mascot, String conference, int ranking) {
        this.name = name;
        this.mascot = mascot;
        this.conference = conference;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public String getMascot() {
        return mascot;
    }

    public String getConference() {
        return conference;
    }

    public int getRanking() {
        return ranking;
    }

    @Override
    public String toString() {
        return name + " (" + mascot + ") - " + conference + " - Rank: " + ranking;
    }
}