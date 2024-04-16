package modifiers_2;

import modifiers_1.Student;

public class SubStudent extends Student {
    int subAge = this.age;
    String subName = this.name;

    SubStudent(int subAge, String subName){
        super(subAge, subName);
        this.subAge = subAge;
        this.subName = subName;
    }
}
