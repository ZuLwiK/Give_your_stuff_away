package pl.zulwik.give_your_stuff_away.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.zulwik.give_your_stuff_away.jsonDeserializers.UserDtoDeserializer;
import pl.zulwik.give_your_stuff_away.model.Role;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@JsonDeserialize(using = UserDtoDeserializer.class)
public class UserDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Set<Role> roles;

}
