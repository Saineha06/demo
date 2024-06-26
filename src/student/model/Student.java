package student.model;

public class Student {
    public String name;

    public int rollNumber;

    public String address;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", address='" + address + '\'' +
                '}';
    }
}