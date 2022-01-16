package case_study.model.Person;

public class Employee extends Person{
    private String education;
    private String poisition;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String fullName, String dayOfBirth, String sex, String identityCardNo, String phoneNo, String email,String education, String poisition, double salary) {
        super(id,fullName,dayOfBirth,sex,identityCardNo,phoneNo,email);
        this.education = education;
        this.poisition = poisition;
        this.salary = salary;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPoisition() {
        return poisition;
    }

    public void setPoisition(String poisition) {
        this.poisition = poisition;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "education='" + education + '\'' +
                ", poisition='" + poisition + '\'' +
                ", salary=" + salary +
                '}';
    }
}
