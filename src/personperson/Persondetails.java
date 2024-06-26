package personperson;

public class Persondetails {
    public String personName;
    public String personPhoneNumber;
    public String personId;
    public String personFatherName;
    public String personMotherName;

    @Override
    public String toString() {
        return "Persondetails{" +
                "personName='" + personName + '\'' +
                ", personPhoneNumber='" + personPhoneNumber + '\'' +
                ", personId='" + personId + '\'' +
                ", personFatherName='" + personFatherName + '\'' +
                ", personMotherName='" + personMotherName + '\'' +
                '}';
    }
}
