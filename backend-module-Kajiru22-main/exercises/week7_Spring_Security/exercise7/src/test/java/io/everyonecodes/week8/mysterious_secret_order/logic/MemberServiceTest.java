package io.everyonecodes.week8.mysterious_secret_order.logic;

import io.everyonecodes.week8.mysterious_secret_order.persistence.domain.Member;
import io.everyonecodes.week8.mysterious_secret_order.persistence.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @MockBean
    MemberRepository memberRepository;

    @MockBean
    PasswordEncoder passwordEncoder;

    @MockBean
    SecurityFilterChain securityFilterChain;

    @Value("${mysterious-secret-order.apprentice.role}")
    String role;

    @Test
    void findAll(){
        memberService.findAll();

        verify(memberRepository).findAll();
    }

    @Test
    void findApprentice(){
        memberService.findApprentice();

        verify(memberRepository).findByAuthorities(role);
    }

    @Test
    void save(){
        Member member = new Member("username","password", Set.of("ROLE_TEST"));
        when(passwordEncoder.encode("password")).thenReturn("encrypted");
        memberService.save(member);

        Member expected = new Member("username", "encrypted", Set.of("ROLE_TEST"));
        assertEquals(expected,member);
        verify(memberRepository).save(expected);
    }

}