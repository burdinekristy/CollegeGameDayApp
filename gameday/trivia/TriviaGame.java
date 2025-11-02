package gameday.trivia;

import java.util.ArrayList;
import java.util.List;

public class TriviaGame {
    private List<TriviaQuestion> questions;
    private int score;
    
    public TriviaGame() {
        questions = new ArrayList<>();
        score = 0;
        loadQuestions();
    }

    private void loadQuestions() {
        questions.add(new TriviaQuestion("Which team is known as the Crimson Tide?", "Alabama"));
        questions.add(new TriviaQuestion("Which conference does Ohio State belong to?", "Big Ten"));
        questions.add(new TriviaQuestion("What is the mascot of the University of Georgia?", "Bulldog"));
        questions.add(new TriviaQuestion("Which team plays in the Big 12 conference?", "Texas"));
        // Add more questions as needed
    }

    public List<TriviaQuestion> getQuestions() {
        return questions;
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}
