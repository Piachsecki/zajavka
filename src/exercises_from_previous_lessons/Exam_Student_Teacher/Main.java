package exercises_from_previous_lessons.Exam_Student_Teacher;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Kacper", "Piasecki");
        Student student1 = new Student("Hania", "Tlusty");
        Student student2 = new Student("Piotrek", "Pawlak");
        Student student3 = new Student("Wiktor", "Kuzmicki");

        teacher.createExam(3);
        student1.solveExam(teacher.createExam(0));
        student2.solveExam(teacher.createExam(0));
        student3.solveExam(teacher.createExam(0));
        teacher.checkAnswers(student1,teacher.createExam(0));
    }
}
