package E10_5;

import E10_7.Question;

public class NumericQuestion extends Question {
    private double correctAnswer;

    public NumericQuestion(String text, double correctAnswer) {
        setText(text);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean checkAnswer(String response) {
        try {
            double responseValue = Double.parseDouble(response);
            return Math.abs(responseValue - correctAnswer) <= 0.01;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

