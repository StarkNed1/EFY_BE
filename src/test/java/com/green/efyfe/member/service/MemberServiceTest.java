package com.green.efyfe.member.service;

import com.green.efyfe.member.DTO.MemberDto;
import com.green.efyfe.member.domain.Member;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberServiceTest {
    @Autowired
    private MemberService memberService;

    @DisplayName("멤버_등록")
    @BeforeEach
    void saveMember() {
        //given
        MemberDto memberDto = new MemberDto();
        memberDto.setMemberId("jaejun.kim");
        memberDto.setMemberName("김재준");

        //when
        Member member = memberService.saveMember(memberDto);

        //then
        assertNotNull(member);
    }

    @DisplayName("멤버_ID_불러오기")
    @Test
    void findById() {
        //given
        long memberId = 1;

        //when
        Member member = memberService.findByid(memberId);

        //then
        assertNotNull(member);
    }
}