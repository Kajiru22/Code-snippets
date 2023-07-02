package io.everyonecodes.booster.evaluation.udemy_users.runner;

import io.everyonecodes.booster.evaluation.udemy_users.presitance.domain.User;
import io.everyonecodes.booster.evaluation.udemy_users.presitance.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@ConfigurationProperties("appuser")
public class DefaultUserRunner {

    private User udemyuser;

    public void setUdemyuser(User udemyuser) {
        this.udemyuser = udemyuser;
    }



    @Bean
    ApplicationRunner prepareUsers(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if (!userRepository.existsByUsername(udemyuser.getUsername())) {
                udemyuser.setUsername(udemyuser.getUsername());
                udemyuser.setAuthorities(udemyuser.getAuthorities());
                udemyuser.setPassword(passwordEncoder.encode(udemyuser.getPassword()));
                userRepository.save(udemyuser);
            }
        };
    }
}