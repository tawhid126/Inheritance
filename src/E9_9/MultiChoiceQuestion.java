package E10_9;
import E10_7.Question;

import java.util.HashSet;
import java.util.Set;

public class MultiChoiceQuestion extends Question {
    private Set<String> correctChoices;

    public MultiChoiceQuestion(String text, String correctChoices) {
        setText(text + " (Select all correct choices: " + correctChoices + ")");
        this.correctChoices = new HashSet<>();
        for (String choice : correctChoices.split("\\s+")) {
            this.correctChoices.add(choice.toLowerCase());
        }
    }

    @Override
    public boolean checkAnswer(String response) {
        Set<String> responses = new HashSet<>();
        for (String answer : response.split("\\s+")) {
            responses.add(answer.trim().toLowerCase());
        }
        return responses.equals(correctChoices);
    }
}
