package Day07;

public class Employee {
    protected float salary;

    public Employee() {
    }

    public Employee(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "salary=" + salary + '}';
    }
}
class Programmer extends Employee {
    private int bonus;

    public Programmer() {
    }

    public Programmer(int bonus) {
        this.bonus = bonus;
    }

    public Programmer(int bonus, float salary) {
        super(salary);
        this.bonus = bonus;
    }

    public float payment() {
        return salary + bonus;
    }

    @Override
    public String toString() {
        return "Programmer{" + super.toString() + "bonus=" + bonus + '}';
    }
}
 class Main1 {
     public static void main(String[] args) {
         Programmer programmer = new Programmer(500, 2000);
         System.out.println(""+programmer);
         System.out.println("Payment: "+programmer.payment());
     }
 }