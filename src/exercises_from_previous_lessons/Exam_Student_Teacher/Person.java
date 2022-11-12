package exercises_from_previous_lessons.Exam_Student_Teacher;

public abstract class Person {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        System.out.println(this.toString());
    }
}
