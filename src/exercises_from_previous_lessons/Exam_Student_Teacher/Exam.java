package exercises_from_previous_lessons.Exam_Student_Teacher;

public class Exam {
    private Question[] questions;
    static int pointsScored;

    public int getNumberOfQuestions() {
        return questions.length;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public Exam(Question[] questions) {
        this.questions = questions;
    }
}
