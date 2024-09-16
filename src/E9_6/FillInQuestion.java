package E10_6;

import E10_7.Question;

public class FillInQuestion extends Question {
    private String answer;

    public FillInQuestion(String text) {
        setText(text);
        int startIndex = text.indexOf('_') + 1;
        int endIndex = text.indexOf('_', startIndex);
        if (startIndex > 0 && endIndex > startIndex) {
            this.answer = text.substring(startIndex, endIndex).trim();
            setText(text.substring(0, startIndex - 1) + "_____" + text.substring(endIndex + 1));
        }
    }

    @Override
    public boolean checkAnswer(String response) {
        return response.trim().equalsIgnoreCase(answer);
    }
}
