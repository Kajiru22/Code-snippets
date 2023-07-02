package io.everyonecodes_optional_evaluation.artwork.Service;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Validated
@Service
public class TextService {

    @Length(min = 3)
    public String validateText(String text) {
        return text;
    }
}
