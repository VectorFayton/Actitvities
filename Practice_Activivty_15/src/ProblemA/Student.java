package ProblemA;

public class Student extends Person {
    private int studentID;
    private String major;

    public Student(String name, int age, String address, String phoneNumber,
                   int studentID, String major) {
        super(name, age, address, phoneNumber);
        this.studentID = studentID;
        this.major = major;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "ProblemA.Student [name=" + getName() + ", age=" + getAge()
                + ", address=" + getAddress() + ", phoneNumber="
                + getPhoneNumber() + ", studentID=" + studentID + ", major=" + major
                + "]";
    }
}

