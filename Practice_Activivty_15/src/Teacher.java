public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String address, String phoneNumber,
                   String subject) {
        super(name, age, address, phoneNumber);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher [name=" + getName() + ", age=" + getAge()
                + ", address=" + getAddress() + ", phoneNumber="
                + getPhoneNumber() + ", subject=" + subject + "]";
    }
}