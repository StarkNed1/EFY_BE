package com.green.efyfe.member.domain;

import com.green.efyfe.member.DTO.MemberDto;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="member")
@Table(name="MEMBER")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MEMBER_NO")
    private Long memberNo;
    @Column(name="MEMBER_ID", nullable = false)
    private String memberID;
    @Column(name="MEMBER_NAME", nullable = false, length = 30)
    private String memberName;
    @Column(name="REG_DATE", nullable = false)
    private Date regDate;

    @Builder
    public Member(MemberDto memberDto) {
        this.memberNo = memberDto.getMemberNo();
        this.memberID = memberDto.getMemberId();
        this.memberName = memberDto.getMemberName();
        this.regDate = new Date();
    }
}
