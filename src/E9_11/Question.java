package E10_11;

public class Question {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public boolean checkAnswer(String response) {
        return response.trim().equalsIgnoreCase(text.trim());
    }
}
