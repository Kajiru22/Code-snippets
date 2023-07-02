package io.everyonecodes.week8.mysterious_secret_order.runner;

import io.everyonecodes.week8.mysterious_secret_order.persistence.domain.Member;
import io.everyonecodes.week8.mysterious_secret_order.persistence.repository.MemberRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@ConfigurationProperties("mysterious-secret-order")
public class EnsureMasterRunner {

    private Member master;

    @Bean
    ApplicationRunner ensureAdminUser(MemberRepository memberRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if(memberRepository.existsByUsername(master.getUsername())){
                return;
            }
            String password = master.getPassword();
            String encodedPassword = passwordEncoder.encode(password);
            master.setPassword(encodedPassword);
            memberRepository.save(master);
        };
    }

    public void setMaster(Member master) {
        this.master = master;
    }
}
