package collections.example;

import java.util.List;

/**
 * Created by andriusbaltrunas on 2/6/2018.
 */
public class Question {
    private String questionText;
    private List<String> variants;
    private int answer;

    public Question(String questionText, List<String> variants, int answer) {
        this.questionText = questionText;
        this.variants = variants;
        this.answer = answer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getVariants() {
        return variants;
    }

    public int getAnswer() {
        return answer;
    }
}
