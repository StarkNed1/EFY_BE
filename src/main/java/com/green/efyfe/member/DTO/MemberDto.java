package com.green.efyfe.member.DTO;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class MemberDto {
    private Long memberNo;
    private String memberId;
    private String memberName;
    private Date regDate;

}
