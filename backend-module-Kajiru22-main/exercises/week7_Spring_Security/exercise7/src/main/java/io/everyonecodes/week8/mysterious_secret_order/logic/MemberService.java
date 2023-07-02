package io.everyonecodes.week8.mysterious_secret_order.logic;

import io.everyonecodes.week8.mysterious_secret_order.persistence.domain.Member;
import io.everyonecodes.week8.mysterious_secret_order.persistence.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;
    private final String message;
    private final String role;

    public MemberService(MemberRepository memberRepository, PasswordEncoder passwordEncoder,
                         @Value("${mysterious-secret-order.message}") String message,
                         @Value("${mysterious-secret-order.apprentice.role}") String role) {
        this.memberRepository = memberRepository;
        this.passwordEncoder = passwordEncoder;
        this.message = message;
        this.role = role;
    }
    public String getMessage(){
        return message;
    }
    public List<Member> findAll(){
        return memberRepository.findAll();
    }

    public List<Member> findApprentice(){
        return memberRepository.findByAuthorities(role);
    }

    public Member save (Member member){
        String password = member.getPassword();
        String encodedPassword = passwordEncoder.encode(password);
        member.setPassword(encodedPassword);
       return memberRepository.save(member);
    }
}
