package solutions.exercise12.refactored.model;

import lombok.*;

import javax.persistence.*;

/**
 * A class representing an account.
 *
 * @since 1.0.0
 * */
@Entity
@RequiredArgsConstructor
@NoArgsConstructor //required by hibernate
@Getter
@EqualsAndHashCode
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    @OneToOne(fetch= FetchType.EAGER, cascade = CascadeType.ALL,
            orphanRemoval = true) //save the persons as well via CascadeType.ALL
    @JoinColumn(name = "person_id")
    Person person;
}
