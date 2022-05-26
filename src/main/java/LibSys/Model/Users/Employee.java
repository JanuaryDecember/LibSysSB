package LibSys.Model.Users;



import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
public class Employee extends AbstractUser{
    @Id
    private final Long id;

    public Employee(String Name, String Surname, int PhoneNumber, int Age, Long id) {
        super(Name, Surname, PhoneNumber, Age);
        this.id = id;
    }

}
