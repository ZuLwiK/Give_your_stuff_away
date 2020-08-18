package pl.zulwik.give_your_stuff_away.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.zulwik.give_your_stuff_away.model.Donation;

public interface DonationRepository extends JpaRepository<Donation,Long> {
}
