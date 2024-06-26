package students;

import java.util.List;

public class Subject {
    public String name;
    public int marks;

    public List<Subject>subjectList;


    public String StudentsDetails(){
        return "StudentDetails";

    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", subjectList=" + subjectList +
                '}';
    }

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;

    }
}

