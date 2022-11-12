package exercises_from_previous_lessons.Exam_Student_Teacher;

public class Question {
    private int[] possibleAnswers;
    private int indexOfCorrectAnswer;

    public Question(int[] possibleAnswers, int indexOfCorrectAnswer) {
        this.possibleAnswers = possibleAnswers;
        this.indexOfCorrectAnswer = indexOfCorrectAnswer;
    }
}
