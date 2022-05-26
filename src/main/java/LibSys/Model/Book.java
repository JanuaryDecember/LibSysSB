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
    private final Long id;
    private final String title;
    private final String author;
    private final String genre;
    private final int publicationyear;
    private final Long magazine_id;
    private int amount;
}
