package exercises_from_previous_lessons.Exam_Student_Teacher;

public class Teacher extends Person implements Examiner{
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
    public String toString() {
        return "Teacher is created:  " + super.toString();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    public Teacher(String name, String surname) {
        super(name, surname);
    }

    @Override
    public Exam createExam(int numberOfStudents) {
        if(numberOfStudents != 0){
            System.out.println("Teacher created : " + numberOfStudents + " exams");
        }
        Question question1 = new Question(new int[3], 1);
        Question question2 = new Question(new int[3], 2);
        Question question3 = new Question(new int[3], 0);
        Question question4 = new Question(new int[3], 1);
        Question question5 = new Question(new int[3], 0);
        Question[] arrayOfQuestions = new Question[5];
        arrayOfQuestions[0] = question1;
        arrayOfQuestions[1] = question2;
        arrayOfQuestions[2] = question3;
        arrayOfQuestions[3] = question4;
        arrayOfQuestions[4] = question5;

        Exam exam = new Exam(arrayOfQuestions);
        return exam;
    }

    @Override
    public void checkAnswers(Student student, Exam exam) {
        System.out.println("Teacher checking answers of : " + student.getWholeName() + " exam");
//        for (int i = 0; i < ; i++) {
//            if(student.solveExam(exam)[i] == exam.getQuestions()[i] ){

//            }


    }

    }

