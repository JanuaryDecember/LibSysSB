package LibSys.Model.Users;

import LibSys.Model.Book;

import java.util.ArrayList;
import java.util.List;

public class Reader extends AbstractUser {


    private final List<Book> BorrowedBooks = new ArrayList<>();

    public Reader(String Name, String Surname, String Username, String Password, int Age, int PhoneNumber){
        super(Name, Surname, Username, Password, Age, PhoneNumber);
    }

    public List<Book> getBorrowedBooks(){
        return BorrowedBooks;
    }

}
