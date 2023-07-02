package io.everyonecodes_week7_spring_security_language_barriers.Service;

import org.springframework.stereotype.Service;

@Service
public class LanguageShoolService {

    int counter = 0;

    public void count() {
        counter ++;
    }

    public int showCounter() {
        return counter;
    }
}
