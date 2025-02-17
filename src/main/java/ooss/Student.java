package ooss;

public class Student extends Person {
    private Klass klass;
    public Student(int id, String name, int age) {
        super(id, name, age);
    }
    @Override
    public String introduce(){
        if (this.klass.isLeader(this))
            return super.introduce() + " I am a student. I am the leader of class "+ this.klass.getNumber() + ".";
        return super.introduce() + " I am a student. I am in class " + this.klass.getNumber() + ".";
    }
    public void join(Klass klass){
        this.klass = klass;
        klass.attach(this);
    }

    public Boolean isIn(Klass klass){
        return klass.equals(this.klass);
    }
    public Klass getKlass() {
        return klass;
    }

}
