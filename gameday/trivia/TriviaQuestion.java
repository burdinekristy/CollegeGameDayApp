package gameday.trivia;

public class TriviaQuestion {
    public String getAnswer() {
        return answer;
    }
    private String question;
    private String answer;

    public TriviaQuestion(String question, String answer) {
        this.question = question;
        this.answer = answer.toLowerCase();
    }

    public String getQuestion() {
        return question;
    }

    public boolean isCorrect(String userAnswer) {
        return userAnswer.toLowerCase().equals(answer);
    }
}
