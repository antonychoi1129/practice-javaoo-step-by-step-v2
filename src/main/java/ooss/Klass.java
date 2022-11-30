package ooss;

import java.util.Objects;

public class Klass {
    private int number;
    private Student leader;
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
        if(this.equals(leader.getKlass()))
            this.leader = leader;
        System.out.println("It is not one of us.");
    }
    public boolean isLeader(Student leader){
        return leader.equals(this.leader);
    }
}
