import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    // properties - public == can be accessed outside of User class
    private String name;
    private LocalDate birthDay;
    public ArrayList<Book> books = new ArrayList<Book>();

    // constructor
    User(String name, String birtDay) {
        this.name = name; 
        this.birthDay = LocalDate.parse("birthDay");
    }

    // getters
    public String getName(){
        return this.name;
    }

    public String getBirthDay(){
        return this.birthDay.toString();
    }

    // calculate age from birth date
    // access level; return type; name of method; 
    public int age() {
        Period age = Period.between(this.birthDay, LocalDate.now());

        // return the age in years 
        return age.getYears();
    }


    // method will accept a parameter
    // this method accepts a variable of type, Book
    public void borrow(Book book) {
        this.books.add(book);
    }

}
