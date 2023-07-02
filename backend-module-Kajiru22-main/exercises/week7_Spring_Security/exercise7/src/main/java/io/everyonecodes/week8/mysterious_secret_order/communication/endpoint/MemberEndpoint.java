package io.everyonecodes.week8.mysterious_secret_order.communication.endpoint;

import io.everyonecodes.week8.mysterious_secret_order.logic.MemberService;
import io.everyonecodes.week8.mysterious_secret_order.persistence.domain.Member;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class MemberEndpoint {
    private final MemberService memberService;

    public MemberEndpoint(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    @Secured({"ROLE_MASTER","ROLE_APPRENTICES"})
    String getMessage(){
        return memberService.getMessage();
    }

    @GetMapping("/members")
    @Secured("ROLE_MASTER")
    List<Member> getMembers(){
        return memberService.findAll();
    }
    @GetMapping("/members/apprentices")
    @Secured({"ROLE_MASTER","ROLE_APPRENTICES"})
    List<Member> getApprentices(){
        return memberService.findApprentice();
    }
    @PostMapping("/members")
    @Secured("ROLE_MASTER")
    Member post(@RequestBody Member member){
        return memberService.save(member);
    }

}
