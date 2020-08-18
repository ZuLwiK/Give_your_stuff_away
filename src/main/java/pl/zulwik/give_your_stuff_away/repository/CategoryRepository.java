package pl.zulwik.give_your_stuff_away.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.zulwik.give_your_stuff_away.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
