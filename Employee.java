import javax.security.sasl.AuthorizeCallback;

public class Employee {
    //phan mô tả thuộc tính Employee
    private int id ;
    private String firstName;
    private String lastName;
    private int salary;
    //cuc ky quan trong ham dung
    public Employee(){
    }
    public Employee(int id, String firstName,String lastName,int salary){
        this.id = id;
        this.firstName= firstName;
        this.lastName= lastName;
        this.salary= salary;
    }
    //phan hanh vi cua Employee
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualSalary(){
        int result;
        result = salary * 12;
        return result;
    }
    public int raiseSalary(int percent) {
        salary = salary + salary * percent / 100;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{"+"id="+id+",firstName="+firstName+",lastName="+lastName+",salary="+salary+'}';
    }
}
 class Main1{
    public static void main(String[] args){
       Employee emp01 = new Employee(111, "A", "Nguyen", 4);
       System.out.println(""+emp01);
        System.out.println(""+emp01.getAnnualSalary());

    }
}

