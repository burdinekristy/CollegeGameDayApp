package gameday.predictions;

import java.util.ArrayList;
import java.util.List;

public class PredictionManager {
    private List<GamePrediction>predictions = new ArrayList<>();
    
    public void addPrediction(GamePrediction prediction) {
        predictions.add(prediction);
    }

    public List<GamePrediction> getPredictions() {
        return predictions;
    }
}
