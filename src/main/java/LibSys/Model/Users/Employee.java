package LibSys.Model.Users;

public class Employee extends AbstractUser{


    public Employee(String Name, String Surname, String Username, String Password, int PhoneNumber, int Age) {
        super(Name, Surname, Username, Password, PhoneNumber, Age);
    }
}
