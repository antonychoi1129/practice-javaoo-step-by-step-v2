package ooss;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {
    private int number;
    private Student leader;
    protected Teacher teacher;
    protected List<Student> students;
    public Klass(int number) {
        this.number = number;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Klass klass = (Klass)o;
        return number == klass.number;
    }
    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
    public int getNumber() {
        return number;
    }
    public void assignLeader(Student leader){
        if(this.equals(leader.getKlass())){
            this.leader = leader;
            if(this.teacher != null)
                System.out.println(String.format(
                    "I am %s, teacher of Class %d. I know %s become Leader.",
                    teacher.getName(),
                    this.number,
                    leader.getName()));

            students.stream().forEach(
                student -> System.out.println(String.format(
                    "I am %s, student of Class %d. I know %s become Leader.",
                    student.getName(),
                    this.number,
                    leader.getName()))
            );
        }
        System.out.println("It is not one of us.");
    }
    public boolean isLeader(Student leader){
        return leader.equals(this.leader);
    }
    public void attach(Teacher teacher){
        this.teacher = teacher;
    }
    public void attach(Student student){
        if (this.students == null)
            this.students = new ArrayList<>();
        this.students.add(student);
    }
}
