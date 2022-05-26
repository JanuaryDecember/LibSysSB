package LibSys.Model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Library {

    @Id
    private final Long id;
    private final String magazine_id;
    private final String name;
    private final String street;
}
