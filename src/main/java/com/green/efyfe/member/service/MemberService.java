package com.green.efyfe.member.service;

import com.green.efyfe.member.DTO.MemberDto;
import com.green.efyfe.member.domain.Member;
import com.green.efyfe.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Member findByid(long memberId){
        return memberRepository.findById(memberId);
    }

    public Member saveMember(MemberDto memberDto){
        return memberRepository.save(Member.builder().memberDto(memberDto).build());
    }

}
