package exercises_from_previous_lessons.Exam_Student_Teacher;

import java.util.Random;

public class Student extends Person implements Examinated{
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    public String getWholeName(){
        return super.getName() + " " + super.getSurname();
    }

    @Override
    public String toString() {
        return "Student is created: "
                + super.toString();
    }

    public Student(String name, String surname) {
        super(name, surname);
    }

    @Override
    public int[] solveExam(Exam exam) {
//        System.out.println(exam.getNumberOfQuestions());
        Random random = new Random();
        int[] answersGiven = new int[exam.getNumberOfQuestions()];
        for (int i = 0; i < exam.getNumberOfQuestions(); i++) {
            int randomIndexAnswered = random.nextInt(3);
            System.out.println("Student: " + this.getWholeName() + " answering question: " + (i + 1) + " possible answers: [1st, 2nd, 3rd], answered :" + (randomIndexAnswered+1));
            answersGiven[i] = randomIndexAnswered;
        }
        return answersGiven;
    }
}
