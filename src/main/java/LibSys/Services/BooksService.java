package LibSys.Services;

import LibSys.Model.Book;
import LibSys.Repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BooksService {
    private final BookRepository bookRepository;

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public Book getSingleBook(Long id){
        return bookRepository.findById(id)
                .orElseThrow();

    }
}
