package com.green.efyfe.member.repository;

import com.green.efyfe.member.DTO.MemberDto;
import com.green.efyfe.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findById(long memberId);
}
