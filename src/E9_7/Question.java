package E10_7;

public class Question {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public boolean checkAnswer(String response) {
        return response.trim().replaceAll("\\s+", " ").equalsIgnoreCase(text.trim().replaceAll("\\s+", " "));
    }
}

