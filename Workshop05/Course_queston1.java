package Workshop05;
import ontap.Course_queston1;
import javax.xml.validation.Validator;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;
class Product {
    private String code;
    private String description;
    private double price;

    public Product() {
        code = "";
        description = "";
        price = 0;

    }

    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFormattedPrice() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
}
class ProductDB {
    public static Product getProduct(String productCode) {
        Product product = new Product();
        product.setCode(productCode);
        if (productCode.equalsIgnoreCase("java")) {
            product.setDescription("Murach's Beginning Java");
            product.setPrice(49.50);
        } else if (productCode.equalsIgnoreCase("jsps")) {
            product.setDescription("Murach's Java Servlets and JSP");
            product.setPrice(49.50);
        } else if (productCode.equalsIgnoreCase("mcb2")) {
            product.setDescription("Murach's Mainframe COBOL");
            product.setPrice(59.50);
        } else {
            product.setDescription("Unknown");
        }
        return product;
    }
}
class Student {
    public static Scanner in = new Scanner(System.in);
    private int idStudent;
    private String name;
    private int numOfCourses = 0;
    private Course_queston1[] myCourse;
    public Student(){
    }

    public Student(int idStudent, String name) {
        this.idStudent = idStudent;
        this.name = name;
    }

    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }
    public void addCourse(){
        myCourse = new Course_queston1[numOfCourses];
        System.out.println("Please enter the information of the courses: ");
        String n; // course name
        double g; // Grade
        for (int i = 0; i < myCourse.length; i++) {
            System.out.print("Enter course name: ");
            n = in.nextLine();
            System.out.print("Enter grade: ");
            g = Student.in.nextDouble();
            in.nextLine();
            Course_queston1 tempCourse = new Course_queston1(n, g);
            myCourse[i] = tempCourse;
        }
    }
    public void studentDetails() {
        System.out.println("Student ID: " + idStudent);
        System.out.println("Student Name: " + name);
        System.out.println("Course in this semester : ");
        for (int i = 0; i < myCourse.length; i++) {
            System.out.println("" + myCourse[i].toString());
        }
    }

    public double getAverageGrades() {
        double average = 0;
        for (int i = 0; i < myCourse.length; i++) {
            average= average + myCourse[i].getGrade();

        }
        average = (double) average / myCourse.length;
        return average ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", name='" + name + '\'' +
                '}';
    }

}
class Validation {
    public static String getString(Scanner sc, String prompt) {
        System.out.println(prompt);
        String s = sc.next();
        sc.nextLine();
        return s;
    }

    public static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            System.out.println(prompt);
            if (sc.hasNext()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error!");
            }
            sc.nextLine();
        }
        return i;
    }

    public static int getInt(Scanner sc, String prompt, int min, int max) {
        int i = 0;
        boolean isValue = false;
        while (isValue == false) {
            i = getInt(sc, prompt);
            if (i <= min)
                System.out.println("Error!Number must be greater than " + min + ".");
            else if (i >= max)
                System.out.println("Error!Number must be less than " + max + ".");
            else
                isValue = true;
        }
        return i;
    }

    public static double getDouble(Scanner sc, String prompt) {
        double d = 0;
        boolean isValid = false;
        while (isValid == false) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(Scanner sc, String prompt, double min, double max) {

        double d = 0;
        boolean isValid = false;
        while (isValid == false) {
            d = getDouble(sc, prompt);
            if (d <= min)
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            else if (d >= max)
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            else
                isValid = true;
        }
        return d;
    }
}
class LineItem {
    private Product product;
    private int quantity;
    private double total;

    public LineItem()
    {
        this.product = new Product();
        this.quantity = 0;
        this.total = 0;
    }

    public LineItem(Product product, int quantity)
    {
        this.product = product;
        this.quantity = quantity;
    }

    public void setProduct(Product product)
    {
        this.product = product;
    }
    public Product getProduct()
    {
        return product;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getTotal()
    {
        this.calculateTotal();
        return total;
    }

    private void calculateTotal()
    {
        double price = product.getPrice();
        total = quantity * price;
    }

    public String getFormattedTotal()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getTotal());
    }
}
class LineItemApp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Line Item Calculator");
        System.out.println();

        // create 1 or more line items
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            String productCode = Validation.getString(sc,
                    "Enter product code: ");
            int quantity = Validation.getInt(sc,
                    "Enter quantity:    ", 0, 1000);

            // get the Product object
            Product product = ProductDB.getProduct(productCode);

            // create the LineItem object
            LineItem lineItem = new LineItem(product, quantity);
            // display the output
            System.out.println();
            System.out.println("LINE ITEM");
            System.out.println("Code:       " + product.getCode());
            System.out.println("Description: " + product.getDescription());
            System.out.println("Price:      " + product.getFormattedPrice());
            System.out.println("Quantity:   " + lineItem.getQuantity());
            System.out.println("Total:      "
                    + lineItem.getFormattedTotal() + "\n");
            // see if the user wants to continue
            choice = Validation.getString(sc, "Continue? (y/n): ");
            System.out.println();
        }
    }
}





