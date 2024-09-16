package E10_8;
import E10_7.Question;

import java.util.HashSet;
import java.util.Set;

public class AnyCorrectChoiceQuestion extends Question {
    private Set<String> correctChoices;

    public AnyCorrectChoiceQuestion(String text, String correctChoices) {
        setText(text + " (Choose one of the following: " + correctChoices + ")");
        this.correctChoices = new HashSet<>();
        for (String choice : correctChoices.split("\\s+")) {
            this.correctChoices.add(choice.toLowerCase());
        }
    }

    @Override
    public boolean checkAnswer(String response) {
        return correctChoices.contains(response.trim().toLowerCase());
    }
}

