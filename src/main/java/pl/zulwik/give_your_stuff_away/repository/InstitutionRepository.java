package pl.zulwik.give_your_stuff_away.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.zulwik.give_your_stuff_away.model.Institution;

public interface InstitutionRepository extends JpaRepository<Institution,Long> {
}
