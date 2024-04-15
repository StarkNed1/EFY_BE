package com.green.efyfe.member.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

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
    private LocalDate regDate;

}
