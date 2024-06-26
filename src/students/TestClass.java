package students;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {

        Student stu=new Student("sai neha");
        List<Subject>subjectList=new ArrayList<>();
        subjectList.add(new Subject("English",65));
        subjectList.add(new Subject("Maths",55));
        subjectList.add(new Subject("Telugu",55));
        System.out.println(stu.name);

    }
}
