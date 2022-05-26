package LibSys.Model.Users;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@NoArgsConstructor
public abstract class AbstractUser implements UsersInterface{

    protected String Name;
    protected String Surname;
    protected int PhoneNumber;
    protected int Age;

    protected AbstractUser(String Name, String Surname, int PhoneNumber, int Age) {
        this.Name = Name;
        this.Surname = Surname;
        this.PhoneNumber = PhoneNumber;
        this.Age = Age;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String getSurname() {
        return Surname;
    }

    @Override
    public int getAge() {
        return Age;
    }

    @Override
    public int getPhoneNumber(){
        return PhoneNumber;
    }

    @Override
    public void getInfo(){
        System.out.println("Name: " + Name);
        System.out.println("Surname: " + Surname);
        System.out.println("Age: " + Age);
        System.out.println("Phone number: " + PhoneNumber);
    }
}
