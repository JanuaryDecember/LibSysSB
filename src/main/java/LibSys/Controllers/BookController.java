package LibSys.Controllers;

import LibSys.Model.Book;
import LibSys.Services.BooksService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {


    private final BooksService booksService;

    @GetMapping("/books")
    public List<Book> getBooks(){
        return booksService.getBooks();
    }

    @GetMapping("/books/{id}")
    public Book geSingleBook(@PathVariable Long id){
        return booksService.getSingleBook(id);
    }
}
