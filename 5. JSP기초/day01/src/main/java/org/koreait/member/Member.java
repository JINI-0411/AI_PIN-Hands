package org.koreait.member;

import lombok.*;

//@Data
//@NoArgsConstructor(access = AccessLevel.PRIVATE) // PRIVATE범위로 하나가 생성됨
//@AllArgsConstructor
//@RequiredArgsConstructor
@Builder // 생성자가 private이라서 못씀
@ToString
public class Member {
    private long seq; // 회원 번호
    private final String email; // 이메일 // 특정변수만 초기화 하고 싶을 때
    // @NonNull // 필드명위에 정의
    //@ToString.Exclude // ToString에서 배제
    private String password;
}
