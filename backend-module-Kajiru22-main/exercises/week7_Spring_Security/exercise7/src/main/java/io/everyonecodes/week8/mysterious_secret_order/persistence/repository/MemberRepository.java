package io.everyonecodes.week8.mysterious_secret_order.persistence.repository;

import io.everyonecodes.week8.mysterious_secret_order.persistence.domain.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends MongoRepository<Member,String> {

    Optional<Member> findOneByUsername(String username);

    boolean existsByUsername(String username);

    List<Member> findByAuthorities (String role);
}
