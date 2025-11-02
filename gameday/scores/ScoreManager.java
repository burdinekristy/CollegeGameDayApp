package gameday.scores;

import java.util.ArrayList;
import java.util.List;

public class ScoreManager {
    private List<GameScore> scores;
    
    public ScoreManager() {
        scores = new ArrayList<>();
        loadMockScores();
    }

    private void loadMockScores() {
        scores.add(new GameScore("Alabama", "Georgia", 24, 21));
        scores.add(new GameScore("Ohio State", "Michigan", 17, 20));
        scores.add(new GameScore("Texas", "Oklahoma", 31, 28));
        scores.add(new GameScore("LSU", "Florida", 14, 14));
        // Add more mock scores or integrate with API later
    }

    public List<GameScore> getScores() {
        return scores;
    }
}
