package E10_10;
public class Question {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public void addText(String additionalText) {
        this.text += " " + additionalText;
    }

    public String getText() {
        return text;
    }

    public boolean checkAnswer(String response) {
        return response.trim().equalsIgnoreCase(text.trim());
    }
}
