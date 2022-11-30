package ooss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private List<Klass> klasses;
    public Teacher(int id, String name, int age) {
        super(id, name, age);
        klasses = new ArrayList<>();
    }
    @Override
    public String introduce(){
        String klassString = this.klasses.stream()
                                    .map( klass -> String.valueOf(klass.getNumber()))
                                    .collect(Collectors.toList())
                                    .stream()
                                    .collect(Collectors.joining(", "));
        return super.introduce() + " I am a teacher. I teach Class " + klassString + ".";
    }
    public void assignTo(Klass klass){
        klasses.add(klass);
    }
    public Boolean belongsTo(Klass klass){
        return klasses.contains(klass);
    }

    public Boolean isTeaching(Student student){
        return this.klasses.contains(student.getKlass());
    }
}
