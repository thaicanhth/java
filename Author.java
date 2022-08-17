import javax.naming.Name;

public class Author {
    private String name;
    private String email;
    private char gender;
    // Ham dung
    public Author(){
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        if(gender == 'M'){
            return "Male";
        }if(gender == 'F'){
            return "FeMale";
        }
        return null;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author {"+"Name: "+name+", email: "+email+" gender: " + getGender() + "}";


    }
}
 class Main2 {
    public static void main(String[] args) {
        Author a01 = new Author("A Nguyen","a@b.c",'M');
        System.out.println(""+a01.toString());
        Author a02 = new Author("B Nguyen","a@b.c",'F');
        System.out.println(""+a02.toString());
    }
}
