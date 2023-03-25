package hello.helloworld.reporitory;

import hello.helloworld.domain.Member;

import java.util.Optional;
import java.util.List;

public interface MemberRepository {
    Member save(Member member); // 멤버 저장 기능
    Optional<Member> findById(Long id); // id로 회원 찾기 기능
//     optional : null로 반환되는 경우 optional로 감싸서 반환. 자바8에 들어간 기능
    Optional<Member> findByName(String name); // name으로 회원 찾기 기능
    List<Member> findAll(); // 지금까지 저장된 모든 회원 list 반환
}
