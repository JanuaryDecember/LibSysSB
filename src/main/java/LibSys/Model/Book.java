package LibSys.Model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Book {

    @Id

    private Long id;
    private String title;
    private String author;
    private String genre;
    private int publicationyear;
    private int amount;
}
