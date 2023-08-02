package Seminars.Sem005.Task001.model;

public class Student extends User {
    int studentId;

    public Student(String name, String surname, String patron, int studentId) {
        super(name, surname, patron);
        this.studentId = studentId;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Студент [ID = " + studentId +
                ", Имя = " + name +
                ", Фамилия = " + surname +
                ", Отчество = " + patron + "]";
    }

}
