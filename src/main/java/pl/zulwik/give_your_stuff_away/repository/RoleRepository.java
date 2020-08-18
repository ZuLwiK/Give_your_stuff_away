package pl.zulwik.give_your_stuff_away.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.zulwik.give_your_stuff_away.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

}
