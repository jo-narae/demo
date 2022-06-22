package com.example.demo.repository;

import com.example.demo.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByFirstNameAndLastName(String firstName, String lastName);

    List<Member> findByAgeGreaterThan(int age);

    // 멤버 lastName이 김씨인 데이터 전체 조회하는 쿼리 메소드

    // 멤버 아이디(이메일)이 있을 경우의 쿼리 메소드(중복 체크를 하기 위해서)

    // 멤버 권한이 유저인 경우의 쿼리 메소드 (type = USER로 던져준다는 가정하에)

    // 멤버 이름이 Ellen이 아닌 경우(매개 변수가 Ellen으로 들어온다는 가정하에)
}
