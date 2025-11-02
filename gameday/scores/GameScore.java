package gameday.scores;

public class GameScore {
    private String teamA;
    private String teamB;
    private int scoreA;
    private int scoreB;

    public GameScore(String teamA, String teamB, int scoreA, int scoreB) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
    }

    public String getTeamB() {
        return teamB;
    }

    public int getScoreA() {
        return scoreA;
    }

    public int getScoreB() {
        return scoreB;
    }

    @Override
    public String toString() {
        return teamA + " " + scoreA + " - " + teamB + " " + scoreB;
    }
}
