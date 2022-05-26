package LibSys.Model.Users;

public abstract class AbstractUser implements UsersInterface{

    protected String Name, Surname, Username, Password;
    protected int PhoneNumber, Age;

    protected AbstractUser(String Name, String Surname, String Username, String Password, int PhoneNumber, int Age) {
        this.Name = Name;
        this.Surname = Surname;
        this.PhoneNumber = PhoneNumber;
        this.Age = Age;
        this.Username = Username;
        this.Password = Password;
    }

    public boolean checkPassword(String Password){
        return this.Password.equals(Password);
    }

    @Override
    public String getUsername(){
        return Username;
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
