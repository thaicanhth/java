import java.util.Scanner;
 class menu {
    public static Scanner in = new Scanner(System.in);

    public static int menu() {
        int choice;
        System.out.println("Press 1: ABC ");
        System.out.println("Press 2: CDF ");
        System.out.println("Press 9: Exit");
        System.out.println("Enter your choice: ");
        choice = in.nextInt();
        return choice;
    }
    public static class mamin2 {
        /*
        @param args the command line arguments
         */
    public static void main(String[] args) {
        int userchoice;
        while (true){
            userchoice = menu();
            //hiển thị menu
            switch (userchoice){
                case 1:
                    System.out.println("Task 1");
                    break;
                case 2:
                    System.out.println("Task 2");
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Invalid");
            }
        }
      }
    }
 }
 /*
 to
  */
     class Student {
     private String name;
     private double gpa;
     public Student() {
     }
     public Student(String name, double gpa){
         this.name = name;
         this.gpa = gpa;
     }
     public Student enterStudent(){
         Scanner in = new Scanner(System.in);
         System.out.println("Enter name:");
         String name = in.nextLine();
         System.out.println("Enter Gpa:");
         double GPA = in.nextDouble();
         Student tempStudent = new Student(name,GPA);
         return tempStudent;
     }
     public String getName(){
         return name;
     }
     public void setName(String name){
         this.name = name;
     }
     public double getGpa() {
         return gpa;
     }
     public void setGpa(double gpa){
         this.gpa = gpa;
     }
     @Override
     public String toString(){
         return "Student{" + "name=" + name + ", gpa=" + gpa + '}';
     }
 }




