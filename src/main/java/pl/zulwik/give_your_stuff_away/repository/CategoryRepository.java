package pl.zulwik.give_your_stuff_away.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.zulwik.give_your_stuff_away.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    @Query("SELECT c FROM Category c WHERE c.id = ?1")
    Category findCategoryById(Long id);

}
