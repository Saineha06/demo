package employe.Details;

public class Employe {
    public String empName;
    public int empAge;
    public String empId;

    @Override
    public String toString() {
        return "Employe{" +
                "empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empId='" + empId + '\'' +
                '}';
    }
}
