package gameday.predictions;

public class GamePrediction {
    private String teamA;
    private String teamB;
    private String predictedWinner;
    private int scoreA;
    private int scoreB;

    public GamePrediction(String teamA, String teamB, String predictedWinner, int scoreA, int scoreB) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.predictedWinner = predictedWinner;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
    }

    public String getTeamA() {
        return teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public String getPredictedWinner() {
        return predictedWinner;
    }

    public int getScoreA() {
        return scoreA;
    }

    public int getScoreB() {
        return scoreB;
    }

    @Override
    public String toString() {
        return teamA + " vs " + teamB + "\nPredicted Winner: " + predictedWinner + "\nPredicted Score: " + teamA + " " + scoreA + " - " + teamB + " " + scoreB;
    }
}
