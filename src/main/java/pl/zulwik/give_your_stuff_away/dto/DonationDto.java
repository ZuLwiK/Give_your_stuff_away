package pl.zulwik.give_your_stuff_away.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.zulwik.give_your_stuff_away.jsonDeserializers.DonationDtoDeserializer;
import pl.zulwik.give_your_stuff_away.model.Donation;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@JsonDeserialize(using = DonationDtoDeserializer.class)
public class DonationDto {

    private Donation donation;
    private Set<String> errors;

}
