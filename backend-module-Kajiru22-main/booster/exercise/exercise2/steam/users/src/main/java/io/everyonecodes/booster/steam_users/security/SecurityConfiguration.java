package io.everyonecodes.booster.steam_users.security;

import io.everyonecodes.booster.steam_users.repositorys.SteamUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable()
                .authorizeRequests()
                /* .antMatchers("/").permitAll() */
                .anyRequest().authenticated()
                .and()
                .httpBasic();
        return http.build();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    DaoAuthenticationProvider authenticationProvider(
            UserDetailsService userDetailsService) {

        DaoAuthenticationProvider authProvider =
                new DaoAuthenticationProvider();
        authProvider
                .setUserDetailsService(userDetailsService);

        authProvider
                .setPasswordEncoder(passwordEncoder());

        return authProvider; //todo ask for provider
    }

    @Bean
    UserDetailsService userDetailsService(SteamUserRepository steamUserRepository) {
        return username ->
                (UserDetails) steamUserRepository.findOneByName(username)
                        .map(UserPrincipal::new)
                        .orElseThrow(() ->
                                new UsernameNotFoundException(username));
    }
}
