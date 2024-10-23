# 조별 프로젝트 안내

## 작업 순서 
1. 조별 그룹 원격 레포지토리 만들기(깃허브) 
2. 기본 틀 소스 다운받아 원격 레포지토리에 초기 업로드 하기(깃허브
3. 작업 계획하기(2024.10.23 까지)
    - 사용자의 이용 관점에서 흐름 정리하기(깃 마인드)
    - 위 항목에서 정리된 내용을 바탕으로 기능 범주화(도메인 나누기) 및 명세 정리하기
    - 정리된 내용을 README.md에 정리하기
    - 도메인별로 작업 분담하기
4. 기본 틀 소스 분석 내용 조별 발표하기
   - 2024.10.24(목) 17:30~18:20
   
4. 작업 진행하기
   - 2024.10.25(금) 9:30~17:20

5. 조별 발표 
   - 발표시간 : 17:30~18:20
   - 발표내용 
      - 기획한 내용 및 소스 구현 내용 
      - 소스 구현 시 반영된 기술적 요소
      - 소스 구현 시 문제 해결 내용 등
---
## MVC
> 역할을 성격별로 명확하게 분리함으로써 유지보수성을 높인다.</br>
> // 폴더별로 역할을 나누면 타인이 봐도 알 수있음 // 예측가능한 구조로 만듦</br>
> 역할 분담 모델

### M(Model) 
> 비지니스 로직 (기능) 구현
- Service (기능)
 - 회원 가입 기능
   JoinService
   1) 사용자가 입력한 회원 가입 데이터 전달
      (DTO - Data Transfer Object : 데이터 전달)
   2) 전달 받은 데이터가 처리에 맞는 데이터인지 체크(유효성 검사)
      Validator // 검증하는 것!
   3) 전달 받은 데이터를 영구 저장(데이터베이스에 저장)
      (DAO - Data Access Object : 데이터 접근 객체)

#### - Service : 기능구현 / 회원가입 기능 -> JoinService
   - DTO(Data Transfer Object) : 데이터 전달 목적의 객체
   - Validator : 데이터 검증
   - DAO(Data Access Object) : 데이터 접근 객체(DB 처리...)
   - VO(Value Object)

### V(View) 
- 처리 결과를 보여주는 부분 // 처리 후 결과에 대한 출력

- <이미지 참고>

- ![image](https://github.com/user-attachments/assets/182fd04a-99a3-46bb-a818-4c37bfeb821f)


### C(Controller) 
- 요청(사용자)  -  요청 처리를 위한 모델, 뷰를 연결   - 응답 (뷰)
- 요청과 응답의 중재자</br>
- 사용자가 전달한 요청 데이터가 유입되는 창구
- <이미지참고>
 
![image](https://github.com/user-attachments/assets/1c9cf8b4-47f0-47c7-95b1-fe7101d82ef4)

- 유입된 데이터의 목적에 맞는 처리 기능을 찾고
- 처리를 중재

---
## DDD(Domain Driven Design) : 도메인 주도 설계
> Domain : 전문가 영역 - 게시판 도메인, 주문 도메인, 상품 도메인, 회원 도메인 ...

- 표현 계층 : View
- 도메인 계층
- 인프라 계층  : 공통 인프라(DB ...)

> MSA(Microservice Architecture)

## 소스 분석
- [도메인 구조 분석](https://github.com/yonggyo1125/ai_pintech_1st_p1/blob/master/STRUCTURE.md)
