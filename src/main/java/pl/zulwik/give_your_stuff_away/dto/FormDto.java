package pl.zulwik.give_your_stuff_away.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.zulwik.give_your_stuff_away.model.Category;
import pl.zulwik.give_your_stuff_away.model.Institution;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class FormDto {

    private List<Category> categories;
    private List<Institution> institutions;

}

