package com.example.demo.repository;

import com.example.demo.domain.Feed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedRepository extends JpaRepository<Feed, Long> {

    // 피드 생성 일자가 특정 기간안에 있는 경우의 쿼리 메소드

    // 피드 생성 일자를 최신순으로 조회하는 쿼리 메소드

    // 피드 내용(content)이 없는 경우를 조회하는 쿼리 메소드

    // 피드 작성자 아이디를 가지고 조회하는 쿼리 메소드
}
