package E10_11;
import java.util.ArrayList;
import java.util.List;

public class ChoiceQuestion extends Question {
    private List<String> choices = new ArrayList<>();

    public ChoiceQuestion(String text) {
        super.setText(text);
    }

    public void addChoice(String choice, boolean correct) {
        if (correct) {
            choices.add(choice.toLowerCase());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        for (String choice : choices) {
            sb.append("\n").append(choice);
        }
        return sb.toString();
    }
}
