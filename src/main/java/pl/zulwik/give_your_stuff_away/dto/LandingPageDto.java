package pl.zulwik.give_your_stuff_away.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.zulwik.give_your_stuff_away.model.Institution;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class LandingPageDto {

    private List<Institution> institutions;
    private Long collectedBags;
    private Long supportedOrganisations;

}
