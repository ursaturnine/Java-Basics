import java.time.LocalDate;
import java.time.Period;

public class User {
    // properties - public == can be accessed outside of User class
    public String name;
    public LocalDate birthDay;

    // calculate age from birth date
    // access level; return type; name of method; 
    public int age() {
        Period age = Period.between(this.birthDay, LocalDate.now());

        // return the age in years 
        return age.getYears();
    }
}
