package exam03;

public class Ex01 {
    public static void main(String[] args) {
   /*   int num = 1;
        int total = 100;*/
        int num = 1, total = 0; // 동일 자료형이면 나열식으로 변수 선언과 초기화 가능
        // num : 초기값

        // int total = 0;
        while (num <= 100) { // 조건식
            // 조건식이 참일때 반복 실행되는 코드
            total += num;
//            total = total + num; // 이것도 복합대입을 사용할 수 있음
            num++; // 증감식 , 다른 연산자와 사용할때는 순서가 중요한데 단독으로 사용할 때는 앞이나 뒤 상관x
//            num = num +1; // 계속 반복하다가 101이 될때 멈춤 / 근데 이것도 증가 연산자를 사용할 수 있음
        }

        System.out.println(total);
    }
}
