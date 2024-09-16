package E10_10;
import java.util.ArrayList;
import java.util.List;

public class ChoiceQuestion extends Question {
    private List<String> choices;

    public ChoiceQuestion(String text) {
        super.setText(text);
        choices = new ArrayList<>();
    }

    public void addChoice(String choice, boolean correct) {
        super.addText(choice);
        if (correct) {
            choices.add(choice.toLowerCase());
        }
    }
}
