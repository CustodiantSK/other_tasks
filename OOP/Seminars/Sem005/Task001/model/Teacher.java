package Seminars.Sem005.Task001.model;

public class Teacher extends User {
    int teacherId;

    public Teacher(String name, String surname, String patron, int teacherId) {
        super(name, surname, patron);
        this.teacherId = teacherId;
    }

    public Teacher() {
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Учитель [ID = " + teacherId +
                ", Имя = " + name +
                ", Фамилия = " + surname +
                ", Отчество = " + patron + "]";
    }

}
