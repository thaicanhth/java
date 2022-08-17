package Wordshop;

class baitap_queston1 {
    private String courseName;
    private double grade;
    public baitap_queston1(){

    }

    public baitap_queston1(String courseName, double grade) {
        this.courseName = courseName;
        this.grade = grade;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Course_queston1{" +
                "courseName='" + courseName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
class main{
    public static void main(String[] args) {
    }
}


