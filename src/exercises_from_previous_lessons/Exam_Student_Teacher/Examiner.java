package exercises_from_previous_lessons.Exam_Student_Teacher;

public interface Examiner {
    Exam createExam(int numberOfStudents);
    void checkAnswers(Student student, Exam exam);
}
