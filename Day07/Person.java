package Day07;

public class Person {
    private String name;
    private String address;
    private String birthday;

    public Person() {
    }
    public Person(String name, String address, String birthday) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", birthday=" + birthday + '}';
    }
}
class Professor extends Person {
    private String department;

    public Professor() {
    }
    public Professor(String name, String address, String birthday, String department) {
        super(name, address, birthday);// public Person(String name, String address, String birthday) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString() + "department=" + department + '}';
    }
}
class Student extends Person {
    private String studentId;
    private String majorField;
    private String degreeSought;

    public Student() {
    }
    public Student(String name, String address, String birthday, String studentId, String majorField, String degreeSought) {
        super(name, address, birthday);//public Person(String name, String address, String birthday)
        this.studentId = studentId;
        this.majorField = majorField;
        this.degreeSought = degreeSought;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() + "studentId=" + studentId + ", majorField=" + majorField + ", degreeSought=" + degreeSought + '}';
    }
}
class Main {
    public static void main(String[] args) {
        Student student = new Student("A", "DaNang", "01/01/2000", "111", "IT", "BE");
        System.out.println(""+student);
        Professor professor = new Professor("B", "DaNang", "01/01/1980", "IT");
        System.out.println(""+professor);
    }
}
