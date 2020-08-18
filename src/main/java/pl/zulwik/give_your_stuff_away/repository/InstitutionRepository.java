package pl.zulwik.give_your_stuff_away.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.zulwik.give_your_stuff_away.model.Institution;

public interface InstitutionRepository extends JpaRepository<Institution,Long> {
    @Query("SELECT i FROM Institution i WHERE i.id = ?1")
    Institution findInstitutionById(Long id);
}

